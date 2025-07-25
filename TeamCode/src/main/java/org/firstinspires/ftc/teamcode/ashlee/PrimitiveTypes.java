package org.firstinspires.ftc.teamcode.ashlee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ashlee PrimitiveTypes")
public class PrimitiveTypes extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {
        // this sends to the driver station
        int teamNumber = 26037;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);

        String myName = "Ashlee";

        telemetry.addData("Hello", myName);

        int grade = 10;
        telemetry.addData("Grade", grade);

    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
        // intentionally left blank
        int x = 5;
        // x is visible here

    }
    // only x is visible here
}
