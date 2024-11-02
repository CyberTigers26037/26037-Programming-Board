package org.firstinspires.ftc.teamcode.subassembly;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class Elbow {
    private Servo servo;
    private static final double SERVO_DEGREES = 270;
    private double currentAngle;
    public Elbow(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "Elbow");
    }

    public void straight() {

    }
    public void down() {

    }

    public void zero() {setServoToAngle(0);}
    public void adjustAngle(double degrees){
        setServoToAngle(currentAngle+degrees);
    }
    private void setServoToAngle(double degrees){
        currentAngle = degrees;
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));

    }
    public double getCurrentAngle() {

        return currentAngle;
    }

}
