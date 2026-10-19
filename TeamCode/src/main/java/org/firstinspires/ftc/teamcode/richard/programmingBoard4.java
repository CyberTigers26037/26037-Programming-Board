package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class programmingBoard4 {
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double tickperRotation;



    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get (DigitalChannel.class, "touchSensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        motor = hwMap.get (DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }










}
