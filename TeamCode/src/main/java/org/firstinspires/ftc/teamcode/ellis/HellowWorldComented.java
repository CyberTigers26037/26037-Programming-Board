package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="ellis Hello world comented")
public class HellowWorldComented extends OpMode {
    /**
     * This is callled when the driver presses INIT
     */
    @Override
    public void init() {
        //this sends to the driver station
        telemetry.addData("Hello", "Ellis");
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
        //intentionally left blank
    }
}