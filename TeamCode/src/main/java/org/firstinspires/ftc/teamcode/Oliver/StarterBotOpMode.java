package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

@TeleOp(name = "Oliver StarterBotOpMode")
public class StarterBotOpMode extends OpMode {
    private DcMotor frontLeftDrive;
    private DcMotor backLeftDrive;
    private DcMotor frontRightDrive;
    private DcMotor backRightDrive;
    private CRServo leftIntakeServo = null;
    private CRServo rightIntakeServo = null;
    private DcMotor intake = null;
    private DcMotorEx launcher = null;
    private CRServo windmillServo = null;

    @Override
    public void init() {
        frontLeftDrive = hardwareMap.get(DcMotor.class, "left_front_drive");
        backLeftDrive = hardwareMap.get(DcMotor.class, "left_back_drive");
        frontRightDrive = hardwareMap.get(DcMotor.class, "right_front_drive");
        backRightDrive = hardwareMap.get(DcMotor.class, "right_back_drive");
        leftIntakeServo = hardwareMap.get(CRServo.class, "left_intake_servo");
        rightIntakeServo = hardwareMap.get(CRServo.class, "right_intake_servo");
        leftIntakeServo.setPower(0);
        rightIntakeServo.setPower(0);
        leftIntakeServo.setDirection(DcMotorSimple.Direction.REVERSE);
        launcher = hardwareMap.get(DcMotorEx.class, "launcher");
        launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        launcher.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, new PIDFCoefficients(40, 0, 0, 12.5));
        windmillServo = hardwareMap.get(CRServo.class, "windmillServo");
        windmillServo.setPower(0);



        // Reverse the left side motor directions
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        intake = hardwareMap.get (DcMotor.class, "intake");
    }

    @Override
    public void loop() {
        double forward = -gamepad1.left_stick_y;
        double lateral = gamepad1.left_stick_x;
        double turn = gamepad1.right_stick_x;
        double intakePower = gamepad1.right_trigger - gamepad1.left_trigger;
        leftIntakeServo.setPower(intakePower);
        rightIntakeServo.setPower(intakePower);
        intake.setPower(intakePower);


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
        if (gamepad1.right_bumper) {
            launcher.setVelocity(1250);
        } else {
            launcher.setVelocity(0);
        }
        if (gamepad1.left_bumper) {
            windmillServo.setPower(1);
        } else {
            windmillServo.setPower(0);
        }

        frontLeftDrive.setPower(frontLeftPower);
        backLeftDrive.setPower(backLeftPower);
        frontRightDrive.setPower(frontRightPower);
        backRightDrive.setPower(backRightPower);
    }
}
