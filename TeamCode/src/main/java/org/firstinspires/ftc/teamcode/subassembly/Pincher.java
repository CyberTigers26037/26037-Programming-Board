package org.firstinspires.ftc.teamcode.subassembly;

import com.qualcomm.hardware.sparkfun.SparkFunOTOS;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;

public class Pincher {

    private static final double SERVO_DEGREES = 270;
    private static final double MIN_SAFE_DEGREES = -90;
    private static final double MAX_SAFE_DEGREES = -30;
    private double currentAngle;
    private Servo servo;
    public Pincher (HardwareMap hardwareMap) {
        servo = hardwareMap.get(Servo.class, "Pincher Servo");

    }

    public void open() {

        setServoToAngle(MAX_SAFE_DEGREES);
    }

    public void close() {

        setServoToAngle(MIN_SAFE_DEGREES);
    }

    public void adjustAngle(double degrees) {

        setServoToAngle(currentAngle + degrees);
    }

    public void zero() {

        setServoToAngle(0);
    }
    private void setServoToAngle(double degrees) {

        degrees = Range.clip(degrees, MIN_SAFE_DEGREES, MAX_SAFE_DEGREES);
        currentAngle = degrees;
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));

    }
    public double getCurrentAngle() {
        return currentAngle;
    }
}
