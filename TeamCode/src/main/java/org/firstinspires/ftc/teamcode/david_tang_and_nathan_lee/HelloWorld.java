package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloWorld extends OpMode {


    public void init() {

        telemetry.addData("Hello", "Nathan Lee!");
    }

    @Override
    public void loop() {


    }
}
