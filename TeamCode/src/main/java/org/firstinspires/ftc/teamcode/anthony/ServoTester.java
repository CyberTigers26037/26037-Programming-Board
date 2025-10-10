package org.firstinspires.ftc.teamcode.anthony;

import com.qualcomm.hardware.lynx.LynxServoController;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.ServoControllerEx;
import com.qualcomm.robotcore.hardware.ServoImplEx;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.ServoConfigurationType;
import com.qualcomm.robotcore.util.Range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@SuppressWarnings("unused")
@TeleOp(name="Anthony Servo Tester")
public class ServoTester extends LinearOpMode {
    private static final double SERVO_DEGREES = 270;
    private static final double CONTROL_RATE = 0.1;
    private boolean servoRepositionMode = false;
    private ServoControllerEx currentServoController;
    private List<ServoControllerEx> servoControllers;
    private HashMap<ServoControllerEx, ArrayList<Servo>> servos;
    private HashMap<ServoControllerEx, ArrayList<Double>> servoPositions;

    @Override
    public void runOpMode() {
        initializeServoControllers();

        while (!isStarted() && !isStopRequested()) {
            allowUserToSelectServoController();
            outputControllerSelectionMessage(true);

            telemetry.addLine("WARNING: ALL servos will be centered.");
            telemetry.addLine();
            telemetry.addLine("Press play to begin");
            telemetry.update();
        }

        while (isStarted() && !isStopRequested()) {
            outputControllerSelectionMessage(false);

            setServoPositionsFromUserInput();

            telemetry.update();
        }
    }

    private void initializeServoControllers() {
        // Obtain the servo controller from our hardware map. There should always be 1.
        servoControllers = hardwareMap.getAll(ServoControllerEx.class);
        if (servoControllers.isEmpty()) {
            telemetry.addLine("Unable to obtain servo controller!");
            telemetry.update();
            return;
        }
        sortServoControllers();

        // Ignore robot configuration, assume there are 6 servos all connected to the ports, and
        // create 6 servo instances we can control.
        servos = new HashMap<>();
        servoPositions = new HashMap<>();
        for (ServoControllerEx servoController : servoControllers) {
            ArrayList<Servo> servoList = new ArrayList<>();
            ArrayList<Double> servoPositionList = new ArrayList<>();

            servos.put(servoController, servoList);
            servoPositions.put(servoController, servoPositionList);

            for (int i = 0; i < 6; i++) {
                servoList.add(new ServoImplEx(servoController, i, ServoConfigurationType.getStandardServoType()));
                servoPositionList.add(0.0);
            }
        }

        // Default to the first controller (the Control Hub in our sorted list)
        currentServoController = servoControllers.get(0);
    }

    private void sortServoControllers() {
        // Sort the servo controller by name (Control Hub, Expansion Hub, Unknown)
        servoControllers.sort(Comparator.comparing(ServoTester::getServoControllerName));
    }

    private void outputControllerSelectionMessage(boolean showChangeButton) {
        if (servoControllers.size() > 1) {
            telemetry.addLine(
                    String.format(Locale.getDefault(),
                    "Controller %d of %d, %s" + (showChangeButton ? " (Y to change)" : ""),
                            servoControllers.indexOf(currentServoController) + 1,
                            servoControllers.size(),
                            getServoControllerName(currentServoController)
                    )
            );

            telemetry.addLine();
        }
    }

    private static String getServoControllerName(ServoController servoController) {
        // This is a hacky way of figuring out whether this is a control hub or expansion hub
        // According to LynxConstants.CH_EMBEDDED_MODULE_ADDRESS, 173 is the module number
        // of the embedded controller (the Control Hub). The only way to get at the module id is by
        // parsing the connection info.
        if (servoController instanceof LynxServoController) {
            LynxServoController controller = (LynxServoController)servoController;
            String connectionInfo = controller.getConnectionInfo();
            if ((connectionInfo != null) && (connectionInfo.contains("module 173"))) {
                return "Control Hub";
            }
            else {
                return "Expansion Hub";
            }
        }
        return "Unknown";
    }

    private void allowUserToSelectServoController() {
        if (gamepad1.yWasPressed()) {
            int nextServoController = servoControllers.indexOf(currentServoController) + 1;
            nextServoController = nextServoController % servoControllers.size();
            currentServoController = servoControllers.get(nextServoController);
        }
    }

    public void setServoPositionsFromUserInput() {
        ArrayList<Double> currentServoPositions = servoPositions.get(currentServoController);
        ArrayList<Servo> currentServos = servos.get(currentServoController);

        if ((currentServoPositions == null) || (currentServos == null)) {
            return;
        }

        if (gamepad1.a) {
            // allow servo positions to be changed
            servoRepositionMode = true;
        }
        else if (gamepad1.b) {
            // set all servo positions back to 0
            servoRepositionMode = false;
            Collections.fill(currentServoPositions, 0.0);
        }

        if (servoRepositionMode) {
            currentServoPositions.set(0, clipServoDegrees(currentServoPositions.get(0) + gamepad1.left_stick_x * CONTROL_RATE));
            currentServoPositions.set(1, clipServoDegrees(currentServoPositions.get(1) - gamepad1.left_stick_y * CONTROL_RATE));
            currentServoPositions.set(2, clipServoDegrees(currentServoPositions.get(2) + gamepad1.right_stick_x * CONTROL_RATE));
            currentServoPositions.set(3, clipServoDegrees(currentServoPositions.get(3) - gamepad1.right_stick_y * CONTROL_RATE));
            currentServoPositions.set(4, clipServoDegrees(currentServoPositions.get(4) + (gamepad1.dpad_left ? -CONTROL_RATE : 0)));
            currentServoPositions.set(4, clipServoDegrees(currentServoPositions.get(4) + (gamepad1.dpad_right ? CONTROL_RATE : 0)));
            currentServoPositions.set(5, clipServoDegrees(currentServoPositions.get(5) + (gamepad1.dpad_down ? -CONTROL_RATE : 0)));
            currentServoPositions.set(5, clipServoDegrees(currentServoPositions.get(5) + (gamepad1.dpad_up ? CONTROL_RATE : 0)));
        }

        telemetry.addData("Servo 0" + (servoRepositionMode ? " (left stick x)" : ""),    "%.1f", currentServoPositions.get(0));
        telemetry.addData("Servo 1" + (servoRepositionMode ? " (left stick y)" : ""),    "%.1f", currentServoPositions.get(1));
        telemetry.addData("Servo 2" + (servoRepositionMode ? " (right stick x)" : ""),   "%.1f", currentServoPositions.get(2));
        telemetry.addData("Servo 3" + (servoRepositionMode ? " (right stick y)" : ""),   "%.1f", currentServoPositions.get(3));
        telemetry.addData("Servo 4" + (servoRepositionMode ? " (dpad left/right)" : ""), "%.1f", currentServoPositions.get(4));
        telemetry.addData("Servo 5" + (servoRepositionMode ? " (dpad up/down)" : ""),    "%.1f", currentServoPositions.get(5));

        // Set all servos to their positions
        for (int i = 0; i < currentServos.size(); i++) {
            setServoToAngle(currentServos.get(i), currentServoPositions.get(i));
        }

        telemetry.addLine();
        if (servoRepositionMode) {
            telemetry.addLine("Press B to center all servos");
        }
        else {
            telemetry.addLine("Press A to change servo angles");
        }
    }

    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }

    private double clipServoDegrees(double degrees) {
        return Range.clip(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2);
    }
}
