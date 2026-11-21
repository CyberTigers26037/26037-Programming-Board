package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp( name = "Oliver HelloWorldCommented")
public class HelloWorldCommented extends OpMode {
        /// This is called when the driver presses INIT

        public void init() {
            // this sends to the driver station
            telemetry.addData("Hello","World");
        }

        /**
         * This is called repeatedly while opmode is playing
         */
   @Override
        public void loop() {
       // intentionally left blank
   }
}
