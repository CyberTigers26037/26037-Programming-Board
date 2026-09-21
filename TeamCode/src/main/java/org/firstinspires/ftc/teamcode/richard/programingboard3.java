package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.Map;

public class programingboard3 {
    private DigitalChannel touchSensor;
    private DcMotor moter;

    private Void init(HardwareMap hwmap){
touchSensor = hwmap.get(DigitalChannel . class,  "touch_sensor");
touchSensor . setMode(DigitalChannel.Mode.INPUT);
moter = hwmap.se


    }



}