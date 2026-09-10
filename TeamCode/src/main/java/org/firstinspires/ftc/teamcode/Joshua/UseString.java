package org.firstinspires.ftc.teamcode.Joshua;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Joshua UseString")
public class  UseString extends OpMode {
    @Override
    public void init() {
        int grade = 9;
        String myName = "Joshua Galvez";

        telemetry.addData("Hello", myName);
        telemetry.addData("Grade", grade);

    }
    @Override
    public void loop() {

    }
}