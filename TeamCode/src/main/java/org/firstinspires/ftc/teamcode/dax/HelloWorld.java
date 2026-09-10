package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Dax is not actively doing software.
// @TeleOp(name ="Dax HelloWorld")
public class HelloWorld extends OpMode {


// This is a comment, hi braeden
/* This is also hello
ooga booga
 */
    @Override
    public void  init() {
        // this sends to the driver station
        telemetry.addData("Hello", "World");

    }

    @Override
    public void loop() {
    }
}