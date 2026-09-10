package org.firstinspires.ftc.teamcode.jasmine;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Jasmine UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Jasmine Horton";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {

    }
}
