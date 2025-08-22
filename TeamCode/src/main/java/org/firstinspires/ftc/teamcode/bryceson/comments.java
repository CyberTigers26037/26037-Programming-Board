package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name= "Bryceson_comments")
public class comments extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {
        // this sends to the driver station
        telemetry.addData("hello","World") ;
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
        // intentionally left blank
    }
}
