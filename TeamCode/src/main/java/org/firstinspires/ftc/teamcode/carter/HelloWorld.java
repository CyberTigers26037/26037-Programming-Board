package org.firstinspires.ftc.teamcode.carter;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Carter HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }

    @Override
    public void loop() {

    }
}

/*page 6 to create a new project*/