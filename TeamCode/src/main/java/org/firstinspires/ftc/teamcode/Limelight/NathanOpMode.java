package org.firstinspires.ftc.teamcode.Limelight;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;


@SuppressWarnings("unused")
@TeleOp(name ="Nathan MecanumDriveTestOpMode", group = "OpMode")
public class NathanOpMode extends LinearOpMode {
    final double TURN_GAIN   =  0.01  ;   //  Turn Control "Gain".  e.g. Ramp up to 25% power at a 25 degree error. (0.25 / 25.0)
    final double MAX_AUTO_TURN  = 0.3;   //  Clip the turn speed to this max value (adjust for your robot)

    @Override
    public void runOpMode(){
        LimeLightAprilTag limeLightAprilTag;

        MecanumDrive drive = new MecanumDrive();
        drive.init(hardwareMap);

        limeLightAprilTag = new LimeLightAprilTag();
        limeLightAprilTag.init(hardwareMap);

        limeLightAprilTag.beginDetectTeamBlue();


        waitForStart();

        while (opModeIsActive()){
            double axial = -gamepad1.left_stick_y;
            double lateral = gamepad1.left_stick_x;
            double yaw = gamepad1.right_stick_x;

            Double goalAngle = limeLightAprilTag.detectGoalAngle();

            if (gamepad1.left_bumper && (goalAngle != null)) {
                double yawError = goalAngle;
                axial = 0;
                lateral = 0;
                yaw = Range.clip(yawError * TURN_GAIN, -MAX_AUTO_TURN, MAX_AUTO_TURN);
            }
            drive.drive(axial, lateral, yaw);
            telemetry.addData("goal angle = ", goalAngle);

            telemetry.update();
        }
    }
}