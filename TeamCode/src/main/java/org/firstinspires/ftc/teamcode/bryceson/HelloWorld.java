package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name= "Bryceson_HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }
    @Override
    public void loop() {

    }


}
