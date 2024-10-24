package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name = "David and Nathan UseRobootLocationOpMode")
public class UseRobootLocationOpMode extends OpMode{
    RobotLocation robotLocation = new RobotLocation(0);
    private boolean leftAlreadyPressed=false;
    private boolean rightAlreadyPressed=false;
    private boolean aAlreadyPressed=false;
    private boolean bAlreadyPressed=false;
    private boolean upAlreadyPressed=false;
    private boolean downAlreadyPressed=false;
    public void init() {
        robotLocation.setAngle(0);
    }


    public void loop() {
        if (gamepad1.a && !aAlreadyPressed){
            robotLocation.turn(-0.1);
        }
        else if (gamepad1.b && !bAlreadyPressed){
            robotLocation.turn(0.1);
        }
        else if (gamepad1.dpad_left && !leftAlreadyPressed){
            robotLocation.changeX(-0.1);

        }
        else if (gamepad1.dpad_right && !rightAlreadyPressed){
            robotLocation.changeX(0.1);

        }
        else if (gamepad1.dpad_up && !upAlreadyPressed){
            robotLocation.changeY(0.1);
        }
        else if (gamepad1.dpad_down && !downAlreadyPressed){
            robotLocation.changeY(-0.1);
        }
        downAlreadyPressed = gamepad1.dpad_down;
        upAlreadyPressed = gamepad1.dpad_up;
        aAlreadyPressed = gamepad1.a;
        bAlreadyPressed = gamepad1.b;
        rightAlreadyPressed = gamepad1.dpad_right;
        leftAlreadyPressed = gamepad1.dpad_left;
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
        telemetry.addData("Angle",robotLocation.getAngle());
        telemetry.addData("x",robotLocation.getX());
        telemetry.addData("y",robotLocation.getY());
    }
}