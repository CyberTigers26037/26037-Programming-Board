package org.firstinspires.ftc.teamcode.Jose;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Jose Hello World")
public class HelloWorld extends OpMode { ;
    @Override
    public void init() {
        telemetry.addData("Hello", "Jose");
    }

    @Override
    public void loop() {

    }
}


