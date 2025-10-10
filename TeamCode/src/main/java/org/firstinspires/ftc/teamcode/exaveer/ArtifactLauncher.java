package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactLauncher {
    private final DcMotorEx flywheelMotor;
    private final Servo flipperServo;

    private boolean isRunning;

    private double flywheelPower = 0.5;

    public double getFlywheelPower() {
        return flywheelPower;
    }

    public void adjustFlywheelPower(double amount) {
        flywheelPower += amount;
        if(flywheelPower > 1.0){
            flywheelPower = 1.0;
        }
        if (flywheelPower < 0.1){
            flywheelPower = 0.1;
        }
    }

    public ArtifactLauncher(HardwareMap hwMap) {
        flywheelMotor = hwMap.get(DcMotorEx.class, "flipperwheelMotor");
        flipperServo = hwMap.get(Servo.class, "flipperServo");
        parkFlipper();
    }

    public void startFlywheelMotor() { // set motor power (0.5 speed)
        flywheelMotor.setPower(flywheelPower);
        isRunning = true;
    }

    public void stopFlywheelMotor() { // stop the motor (0.0 speed)
        flywheelMotor.setPower(0.0);
        isRunning = false;
    }

    public void raiseFlipper() { // lower flipper servo to 45 degrees
        setServoToAngle(flipperServo, 90);
    }

    public void parkFlipper() { // lower flipper servo to 0 degrees
        setServoToAngle(flipperServo, 0);
    }

    public boolean isRunning() {
        return isRunning;
    }

    private static final double SERVO_DEGREES = 270;
    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }

}
