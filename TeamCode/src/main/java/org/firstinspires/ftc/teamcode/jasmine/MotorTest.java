package org.firstinspires.ftc.teamcode.jasmine;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@SuppressWarnings("unused")
@TeleOp(name="Jasmine MotorTest")
public class MotorTest extends OpMode {
    private DcMotor motor;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
    }

    @Override
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
