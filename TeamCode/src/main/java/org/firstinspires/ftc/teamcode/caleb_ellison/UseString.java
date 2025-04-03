package org.firstinspires.ftc.teamcode.caleb_ellison;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Caleb Ellison")
public class UseString extends OpMode {
    @Override
    public void init() {
        String x = "Caleb Ellison";

        telemetry.addData("Hello", x);
    }
    @Override
    public void loop() {
        int age=16;

        telemetry.addData("My age is", age);
    }
}