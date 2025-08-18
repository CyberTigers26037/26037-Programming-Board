package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Dex Lungtwist the 42nd";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {

    }
}