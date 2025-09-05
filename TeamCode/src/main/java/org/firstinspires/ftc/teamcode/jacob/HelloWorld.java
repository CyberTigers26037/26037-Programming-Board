package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous(name="Jacob HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","Jacob");
    }

    @Override
    public void loop() {

    }
}
