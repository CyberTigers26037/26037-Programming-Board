package org.firstinspires.ftc.teamcode.Lilliana;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Lilliana HelloLilliana")
public class HelloWorld extends OpMode {
    @Override
    public void  init() {telemetry.addData("Hello","Lilliana") ;
    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0){
            telemetry.addData("Left stick", "is negative");
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}

/* comment */