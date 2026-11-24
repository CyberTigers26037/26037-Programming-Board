package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@SuppressWarnings("unused")
@TeleOp(name = "Oliver MotorTest")
public class MotorTest extends OpMode {
    private DcMotor motor;

    @Overide
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
    }

    @Overide
    public void loop() {
        motor.setPower(gamepad1.left_stick_y);

        if (gamepad1.a) {
            motor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        else {
            motor.setDirection(DcMotorSimple.Direction.FORWARD);
        }
    }
}
