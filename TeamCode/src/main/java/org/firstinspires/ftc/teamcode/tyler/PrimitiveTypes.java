package org.firstinspires.ftc.teamcode.tyler;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "Tyler PrimitiveTypes")
public class PrimitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber = 26037;
        double motorSpeed = 0.7;
        boolean touchSensorPressed = false;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
    }

    @Override
    public void loop() {

    }
}
