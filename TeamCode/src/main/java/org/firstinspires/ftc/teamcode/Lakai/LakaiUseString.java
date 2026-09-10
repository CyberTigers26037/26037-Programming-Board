package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Lakai UseString")
public class LakaiUseString extends OpMode {
    @Override
    public void init() {
        String myName = "Lakai Raxter";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {

    }
}