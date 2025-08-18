package org.firstinspires.ftc.teamcode.nathan_lee_without_david;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfOpMode extends OpMode {
    public void init(){
    }

    public void loop() {
        if(gamepad1.left_stick_y < 0){
            telemetry.addData("Gamepad 1 left stick y", "negative");

        }
        telemetry.addData("gamepad 1 left stick y", gamepad1.left_stick_y);
    }
}
