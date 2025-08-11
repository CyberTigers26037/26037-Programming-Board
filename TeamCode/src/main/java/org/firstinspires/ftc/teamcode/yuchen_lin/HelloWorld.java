package org.firstinspires.ftc.teamcode.yuchen_lin;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Yuchen Hello World")
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }

    @Override
    public void loop() {


    }
}

