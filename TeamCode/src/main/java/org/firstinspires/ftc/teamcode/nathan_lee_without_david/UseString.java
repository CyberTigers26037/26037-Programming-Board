package org.firstinspires.ftc.teamcode.nathan_lee_without_david;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Nathan, Lee";


        telemetry.addData("Hello", myName);
    }
    public void loop(){


    }
}
