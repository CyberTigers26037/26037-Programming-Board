package org.firstinspires.ftc.teamcode.rob;

import androidx.core.math.MathUtils;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Rob Programming Claw Test")

public class ProgrammingBoardClaw extends OpMode {
    private static final double SERVO_DEGREES = 270;
    private static final double WRIST_OFFSET=-1.0;
    private Servo claw;
    private Servo wrist;
    private Servo elbowLt;
    private Servo elbowRt;
    private double clawDegrees=-10;
    private double wristDegrees=0;
    private double elbowDegrees=0;

    @Override
    public void init() {
        claw=hardwareMap.get(Servo.class,"claw_servo");
        wrist=hardwareMap.get(Servo.class, "wrist_servo");
        elbowLt=hardwareMap.get(Servo.class, "elbowLt_servo");
        elbowRt=hardwareMap.get(Servo.class, "elbowRt_servo");

        setServoToAngle(claw,clawDegrees);
        setServoToAngle(wrist, wristDegrees+WRIST_OFFSET);
        setServoToAngle(elbowLt, elbowDegrees);
        setServoToAngle(elbowRt, -elbowDegrees);
    }

    @Override
    public void loop() {
        // Open/Close Claw w/rt stick moving lt and rt - Will hold posit when released
        clawDegrees += gamepad1.right_stick_x*1.0;

        // Claws are fully open at 10 deg and fully closed at 90 deg
        clawDegrees = MathUtils.clamp(clawDegrees,-90,-10);
        setServoToAngle(claw, clawDegrees);

        // Actuate Wrist w/lt stick moving lt and rt - will hold posit when released
        wristDegrees += gamepad1.left_stick_x*1.0;

        // Wrists are centered at 0 - will actuate -90 deg to 90 deg
        wristDegrees = MathUtils.clamp(wristDegrees, -90,90);
        setServoToAngle(wrist, wristDegrees+WRIST_OFFSET);

        // Elevate elbow w/lt stick moving fwd and aft - will hold posit when released
        elbowDegrees += gamepad1.left_stick_y*1.0;

        // Elbows are centered at 20deg from zero (tucked in) and actuate to 90deg
        elbowDegrees = MathUtils.clamp(elbowDegrees, -90,20);

        // Lt Elbow pos | Rt Elbow neg
        setServoToAngle(elbowLt, elbowDegrees);
        setServoToAngle(elbowRt, -elbowDegrees);

        // Telemetry to view data
        telemetry.addData("Claw Degrees",clawDegrees);
        telemetry.addData("Wrist Degrees", wristDegrees);
        telemetry.addData("Elbow Degrees", elbowDegrees);
        telemetry.update();
    }

    private void setServoToAngle(Servo servo, double degrees) {
        degrees += SERVO_DEGREES / 2;
        servo.setPosition(degrees / SERVO_DEGREES);
    }
}
