package org.firstinspires.ftc.teamcode.nathan_lee_without_david;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class PrimitiveTypes extends OpMode {

    public void init() {
        int teamNumber = 26037;
        boolean touchSensorPressed = true;
        double motorSpeed = 0.5;
        telemetry.addData("teamNumber", teamNumber);
        telemetry.addData("touchSensorPressed", touchSensorPressed);
        telemetry.addData("motorSpeed", motorSpeed);
    }
    public void loop(){


    }

}
