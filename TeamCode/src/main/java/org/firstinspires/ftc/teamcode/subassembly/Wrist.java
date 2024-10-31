package org.firstinspires.ftc.teamcode.subassembly;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class Wrist {
    private Servo servo;
    private static final double SERVO_DEGREES = 270;
    private double currentAngle;
    public Wrist(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "Wrist");
    }

    public void straight() {

    }
    public void right90() {

    }
    public void left90() {

    }
    public void zero() {
        setServoToAngle(0);
    }
    public void adjustAngle(double degrees){
        setServoToAngle(currentAngle+degrees);
    }
    private void setServoToAngle(double degrees){
        currentAngle = degrees;
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));

    }
}
