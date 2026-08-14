package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="ellis Usingstrings")
public class StringTest extends OpMode {
    @Override
    public void init () {
        String myName = "Ellis Hernandez";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop(){

    }
}