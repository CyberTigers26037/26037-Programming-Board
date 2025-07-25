package org.firstinspires.ftc.teamcode.ashlee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Ashlee HelloWorld")

public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Ashlee");
    }

    @Override
    public void loop() {

    }
}
