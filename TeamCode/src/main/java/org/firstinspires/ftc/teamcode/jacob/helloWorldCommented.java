package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class helloWorldCommented extends OpMode {
    /**
            * This is called when the driver presses INIT
       */
    @Override
    public void init() {

      // this sends to the driver station
        telemetry.addData("Hello","World");
    }

    /**
     * This is called repeatedly while opMode is playing
     */
    @Override
    public void loop() {
        // intentionally left blank
    }
}
