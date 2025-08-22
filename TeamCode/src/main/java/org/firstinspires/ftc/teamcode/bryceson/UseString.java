package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "bryceson_UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Bryceson Campbell";

        telemetry.addData("Hello",myName);
    }

    @Override
    public void loop() {

    }
}
