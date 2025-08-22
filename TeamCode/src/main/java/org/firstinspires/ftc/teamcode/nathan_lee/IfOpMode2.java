package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan OpMode2")

public class IfOpMode2 extends OpMode {
    @Override
    public void init(){
    }
    public void loop() {
        if(gamepad1.a){
            telemetry.addData("A Button", "pressed");
        }
    }
}
