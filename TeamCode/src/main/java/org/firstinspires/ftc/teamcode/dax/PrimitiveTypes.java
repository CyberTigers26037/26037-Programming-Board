package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="DaxPrimitiveTypes")
public class PrimitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber = 676766;
        double motorspeed = 0.5;
        boolean touchSensorPressed = true;

    telemetry.addData("Team Number", teamNumber);
    telemetry.addData("Motor Speed", motorspeed);
    telemetry.addData("Touch Sensor", touchSensorPressed);
}

@Override
public void loop() {

    }
}