package org.firstinspires.ftc.teamcode.ashlee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// Coach Anthony, 8/2026, Commenting out for now because Ashlee is not actively doing software.
// @Autonomous(name = "Ashlee HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Ashlee");
    }

    @Override
    public void loop() {

    }
}
