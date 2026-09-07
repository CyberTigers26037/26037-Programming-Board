package org.firstinspires.ftc.teamcode.anthony;

import com.bylazar.telemetry.PanelsTelemetry;
import com.bylazar.telemetry.TelemetryManager;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@SuppressWarnings("unused")
@TeleOp(name="Anthony Swerve Drive Pod Test")
public class ServeDrivePodTest extends OpMode {
    private enum TUNING_PARAMETER { P, I, D }
    private static final double TUNING_ADJUSTMENT_P = 0.001;
    private static final double TUNING_ADJUSTMENT_I = 0.00001;
    private static final double TUNING_ADJUSTMENT_D = 0.0001;

    private TelemetryManager telemetryM;
    private Timer inputTimer;
    private RTPAxon axon;
    private DcMotor driveMotor;
    private TUNING_PARAMETER tuningParameter = TUNING_PARAMETER.P;

    @Override
    public void init() {
        inputTimer = new Timer(0.25, true);
        CRServo servo = hardwareMap.get(CRServo.class, "swerveServo");
        AnalogInput encoder = hardwareMap.get(AnalogInput.class, "swerveEncoder");
        driveMotor = hardwareMap.get(DcMotor.class, "swerveMotor");

        axon = new RTPAxon(servo, encoder, 0);
        axon.setMaxPower(1.0);
        axon.setPidCoeffs(0.01, 0.0005, 0.0);
        telemetryM = PanelsTelemetry.INSTANCE.getTelemetry();
    }

    @Override
    public void loop() {
        axon.update();

        if (gamepad1.xWasPressed()) tuningParameter = TUNING_PARAMETER.P;
        if (gamepad1.yWasPressed()) tuningParameter = TUNING_PARAMETER.I;
        if (gamepad1.bWasPressed()) tuningParameter = TUNING_PARAMETER.D;

        telemetry.addLine("Dpad to set target angle: U 0, R 90, D 180, L 270");
        telemetry.addLine("X to tune P, Y to tune I, B to tune D");
        telemetry.addLine("Right Stick Y to drive motor");
        telemetry.addLine();

        double tuningAdjustment;
        if ((gamepad1.left_stick_y < -0.5) && inputTimer.isExpired()) {
            tuningAdjustment = 1;
            inputTimer.start();
        }
        else if ((gamepad1.left_stick_y > 0.5) && inputTimer.isExpired()) {
            tuningAdjustment = -1;
            inputTimer.start();
        }
        else {
            tuningAdjustment = 0;
        }

        if (tuningAdjustment != 0) {
            switch (tuningParameter) {
                case P:
                    axon.setKP(axon.getKP() + (tuningAdjustment * TUNING_ADJUSTMENT_P));
                    break;
                case I:
                    axon.setKI(axon.getKI() + (tuningAdjustment * TUNING_ADJUSTMENT_I));
                    break;
                case D:
                    axon.setKD(axon.getKD() + (tuningAdjustment * TUNING_ADJUSTMENT_D));
                    break;
            }
        }

        if (gamepad1.dpadUpWasPressed()) {
            axon.setTargetRotation(0);
        }
        if (gamepad1.dpadRightWasPressed()) {
            axon.setTargetRotation(90);
        }
        if (gamepad1.dpadDownWasPressed()) {
            axon.setTargetRotation(180);
        }
        if (gamepad1.dpadLeftWasPressed()) {
            axon.setTargetRotation(270);
        }

        driveMotor.setPower(-gamepad1.right_stick_y);

        telemetry.addData("Currently Tuning", tuningParameter);
        telemetry.addLine("Left Stick Y to Adjust");
        telemetry.addLine();

        telemetry.addData("P", axon.getKP());
        telemetry.addData("I", String.format("%.5f", axon.getKI()));
        telemetry.addData("D", axon.getKD());

        telemetry.addData("Servo Position", axon.getCurrentAngle());
        telemetry.addData("Total Rotation", axon.getTotalRotation());
        telemetry.addData("Target Rotation", axon.getTargetRotation());
        telemetry.addData("Motor Power", driveMotor.getPower());
        telemetry.addLine(axon.log());
        telemetry.update();

        telemetryM.addData("Target Rotation", axon.getTargetRotation());
        telemetryM.addData("Actual Rotation", axon.getTotalRotation());
        telemetryM.update();
    }
}
