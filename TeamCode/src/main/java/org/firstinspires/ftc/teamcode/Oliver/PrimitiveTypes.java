package org.firstinspires.ftc.teamcode.Oliver;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp( name = "Oliver PrimitiveTypes")
public class PrimitiveTypes extends OpMode {
@Override
    public void init() {
    int teamNumber = 26037;
    double motorSpeed = 0.5;
    boolean touchSensorPressed = true;

    telemetry.addData("Team Number", teamNumber);
    telemetry.addData("Motor Speed", motorSpeed);
    telemetry.addData("Touch sensor", touchSensorPressed);
    }

    @Override
    public void loop() {

    }
}
