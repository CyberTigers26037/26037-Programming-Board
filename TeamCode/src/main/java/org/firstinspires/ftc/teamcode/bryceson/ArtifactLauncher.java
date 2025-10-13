package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactLauncher {
    private final DcMotorEx flywheelMotor;
    private final Servo flipperServo;

    public ArtifactLauncher(HardwareMap hwMap) {
        flywheelMotor = hwMap.get(DcMotorEx.class, "flywheelMotor");
        flipperServo = hwMap.get(Servo.class, "flipperServo");
        parkFlipper();
    }

    public void startFlywheelMotor() {
        flywheelMotor.setPower(0.5);
    }

    public void stopFlywheelMotor() {
        flywheelMotor.setPower(0);
    }

    public void raiseFlipper() {
        flipperServo.setPosition(45);
    }
    private void parkFlipper() {
        flipperServo.setPosition(0);
    }

    private static final double SERVO_DEGREES = 270;
    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }
}
