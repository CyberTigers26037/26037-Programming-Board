package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Oliver MecanumDriveOpMode")
public class MecanumDriveOpMode extends OpMode {
    private DcMotor frontLeftDrive;
    private DcMotor backLeftDrive;
    private DcMotor frontRightDrive;
    private DcMotor backRightDrive;

    @Override
    public void init() {
        frontLeftDrive = hardwareMap.get(DcMotor.class, "left_front_drive");
        backLeftDrive = hardwareMap.get(DcMotor.class, "left_back_drive");
        frontRightDrive = hardwareMap.get(DcMotor.class, "right_front_drive");
        backRightDrive = hardwareMap.get(DcMotor.class, "right_back_drive");

        // Reverse the left side motor directions
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        double forward = -gamepad1.left_stick_y;
        double lateral = gamepad1.left_stick_x;
        double turn = gamepad1.right_stick_x;

        double frontLeftPower = forward + lateral + turn;
        double frontRightPower = forward - lateral - turn;
        double backLeftPower = forward - lateral + turn;
        double backRightPower = forward + lateral - turn;

        double max = Math.max(
                Math.max(Math.abs(frontLeftPower), Math.abs(frontRightPower)),
                Math.max(Math.abs(backLeftPower), Math.abs(backRightPower)));

        if (max > 1.0) {
            frontLeftPower /= max;
            frontRightPower /= max;
            backLeftPower /= max;
            backRightPower /= max;
        }

        frontLeftDrive.setPower(frontLeftPower);
        backLeftDrive.setPower(backLeftPower);
        frontRightDrive.setPower(frontRightPower);
        backRightDrive.setPower(backRightPower);
    }
}
