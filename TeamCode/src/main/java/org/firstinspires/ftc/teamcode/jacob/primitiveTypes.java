package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp()
public class primitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber=16072;
        double motorSpeed=0.5;
        boolean touchSensorPressed;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
    }

    @Override
    public void loop() {

    }
}
