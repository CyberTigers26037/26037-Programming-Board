package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name = "David and Nathan UseRobootLocationOpMode")
public class UseRobootLocationOpMode extends OpMode{
    RobotLocation robotLocation = new RobotLocation(0);


    public void init() {
        robotLocation.setAngle(0);
    }


    public void loop() {
     if (gamepad1.a){

         robotLocation.turn(-0.1);

     }
     else
         if (gamepad1.b){
             robotLocation.turn(0.1);

         }
         telemetry.addData("Location", robotLocation);
         telemetry.addData("Heading", robotLocation.getHeading());
        telemetry.addData("Angle",robotLocation.getAngle());
    }
        }