package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="Nathan Lee UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Nathan, Lee";


        telemetry.addData("Hello", myName);
    }
    public void loop(){


    }
}
