package org.firstinspires.ftc.teamcode.otylia;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name = "PrimitiveTypes", group = "otylia")
public class PrimitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber = 26037;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
    }
    @Override
    public void loop() {

    }
}
