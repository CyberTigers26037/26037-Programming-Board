package org.firstinspires.ftc.teamcode.subassembly;

import com.qualcomm.hardware.sparkfun.SparkFunOTOS;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;

public class Pincher {

    private static final double SERVO_DEGREES = 270;
    private double currentAngle;
    private Servo servo;
    public Pincher (HardwareMap hardwareMap) {
        servo = hardwareMap.get(Servo.class, "Pincher Servo");

    }

    public void open() {

    }

    public void close() {

    }

    public void adjustAngle(double degrees) {

        setServoToAngle(currentAngle + degrees);
    }

    public void zero() {

        setServoToAngle(0);
    }
    private void setServoToAngle(double degrees) {
        currentAngle = degrees;
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));

    }
    public double getCurrentAngle() {
        return currentAngle;
    }
}
