package org.firstinspires.ftc.teamcode.nettles;
import  com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nettles PrimitiveTypes")

public class NettlesPrimitiveTypes extends OpMode {
@Override
    public void init() {
    int teamNumber = 16072;
    double motorSpeed = 0.5;
    boolean touchSensorPressed = true;
    telemetry.addData("Team Number", teamNumber);
    telemetry.addData( "Motor Speed", motorSpeed);
    telemetry.addData("Touch Sensor", touchSensorPressed);
}
@Override
    public void loop(){

}
}
