package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Dax is not actively doing software.
// @TeleOp(name ="Dax UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Dex Lungtwist the 42nd";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {

    }
}