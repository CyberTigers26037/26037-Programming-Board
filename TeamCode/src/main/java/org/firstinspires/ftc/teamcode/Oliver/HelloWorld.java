package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

   // this is a comment that is comment

    @TeleOp()
    public class HelloWorld extends OpMode {
        @Override
        public void init() {
            telemetry.addData("Hello","World");
        }

        @Override
        public void loop() {

        }
    }
/* this is a comment */