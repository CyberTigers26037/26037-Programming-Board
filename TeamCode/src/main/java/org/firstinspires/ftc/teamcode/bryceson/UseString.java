package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Bryceson is not actively doing software.
// @TeleOp(name = "Bryceson_UseString")
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
