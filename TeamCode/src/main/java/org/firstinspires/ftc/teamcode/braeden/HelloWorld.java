package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@Autonomous(name = "Braeden HelloWorld")

public class HelloWorld extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {
        // this sends to driver station
        telemetry.addData("Hello", "Braeden");


        // datatype name
        int teamNumber = 16072;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
        // intentionally left blank
    }
}