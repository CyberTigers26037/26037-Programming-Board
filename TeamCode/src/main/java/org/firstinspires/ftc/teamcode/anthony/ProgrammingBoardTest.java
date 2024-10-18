package org.firstinspires.ftc.teamcode.anthony;

import android.graphics.Color;

import androidx.core.math.MathUtils;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

@SuppressWarnings("unused")
@TeleOp(name="Anthony Programming Board Test")
public class ProgrammingBoardTest extends OpMode {
    private static final double SERVO_DEGREES = 270;

    private DcMotor motor;
    private Servo servo;
    private AnalogInput potentiometer;
    private TouchSensor touchSensor;
    private NormalizedColorSensor colorSensor;

    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        motor = hardwareMap.get(DcMotor.class, "motor");
        servo = hardwareMap.get(Servo.class, "servo");
        potentiometer = hardwareMap.analogInput.get("potentiometer");
        touchSensor = hardwareMap.get(TouchSensor.class, "touchSensor");
        colorSensor = hardwareMap.get(NormalizedColorSensor.class, "colorSensor");
    }

    @Override
    public void loop() {
        telemetry.addData("Status: ", "Running");

        // Run motor based on left stick y
        double motorPower = -this.gamepad1.left_stick_y;
        motor.setPower(motorPower);
        telemetry.addData("Motor Power: ", motorPower);

        // Set servo position to +/- 45 degrees based on right stick x
        double servoAngle = gamepad1.right_stick_x * 45;
        setServoToAngle(servoAngle);
        telemetry.addData("Servo Angle: ", servoAngle);

        // Read potentiometer position
        double potVoltage = potentiometer.getVoltage();
        double potMaxVoltage = potentiometer.getMaxVoltage();
        double percentTurned = potVoltage/potMaxVoltage * 100;
        percentTurned = MathUtils.clamp(percentTurned, 0, 100);
        telemetry.addData("Pot Percentage: ", percentTurned);

        // Read color sensor
        final float[] hsvValues = new float[3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        telemetry.addData("Color Sensor Hue", "%.3f", hsvValues[0]);

        // Read touch sensor state
        telemetry.addData("Touch Sensor: ", touchSensor.isPressed() ? "On" : "Off");

        telemetry.update();
    }

    private void setServoToAngle(double degrees) {
        degrees += SERVO_DEGREES / 2;
        servo.setPosition(degrees / SERVO_DEGREES);
    }
}
