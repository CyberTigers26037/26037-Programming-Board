package org.firstinspires.ftc.teamcode.nathan_lee;


import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactLauncher {
    private final DcMotorEx flywheelMotor;
    private final Servo flipperServo;
    private double flywheelPower = 0.5;
    private boolean isRunning;
    public double getFlywheelPower(){
        return flywheelPower;
    }


    public void adjustFlywheelPower(double amount){
        flywheelPower += amount;
        flywheelPower = Range.clip(flywheelPower,0.1,1.0);
    }



    public ArtifactLauncher(HardwareMap hwMap) {
        flywheelMotor = hwMap.get(DcMotorEx.class, "flywheelMotor");
        flipperServo = hwMap.get(Servo.class, "flipperServo");
        parkFlipper();
    }


    public void startFlywheelMotor() {
        flywheelMotor.setPower(flywheelPower);
        isRunning = true;
    }


    public void stopFlywheelMotor() {
        flywheelMotor.setPower(0.0);
        isRunning = false;
        // TODO: write code to stop the motor (0.0 speed)
    }


    public void raiseFlipper() {
        setServoToAngle(flipperServo,93);
        // TODO: Raise the flipper servo to the correct angle (45 degrees)
    }


    public void parkFlipper() {
        setServoToAngle(flipperServo,0);
        // TODO:Lower the flipper servo to the correct angle (0 degrees)
    }

    public boolean isRunning(){
        return isRunning;
    }


    private static final double SERVO_DEGREES = 270;
    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }
}


