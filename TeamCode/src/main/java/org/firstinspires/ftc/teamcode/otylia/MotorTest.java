package org.firstinspires.ftc.teamcode.otylia;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorTest extends OpMode {

    private DcMotor motor;
    private DcMotor leftDrive;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "Motor");
    }

    @Override
    public void loop() {
        motor.setPower(gamepad1.right_stick_x);
    }
}
