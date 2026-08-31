package org.firstinspires.ftc.teamcode.jasmine;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Jasmine HelloWorldCommented")
public class HelloWorldCommented extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }

    @Override
    public void loop() {

    }
}
