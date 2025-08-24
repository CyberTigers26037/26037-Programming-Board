package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan Lee IfElseOpMode")
public class IfElseOpMode extends OpMode {
    @Override
    public void init(){
    }
    public void loop(){
        if(gamepad1.left_stick_y < 0){
            telemetry.addData("Left Stick Y", "is negative");
        }
        else{
            telemetry.addData("left Stick Y", "is Positive");
            }
        telemetry.addData("Left stick Y", gamepad1.left_stick_y);

    }
}
