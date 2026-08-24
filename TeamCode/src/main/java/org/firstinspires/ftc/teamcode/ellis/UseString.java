package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="ellis Usingstrings")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "ellis hernandez";

        int grade = 50;

        telemetry.addData("Hello", myName);

        telemetry.addData("grade",grade);

    }

    @Override
    public void loop() {

    }
}