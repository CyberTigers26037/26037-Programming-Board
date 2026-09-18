package org.firstinspires.ftc.teamcode.MiladM;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard3 {
    private DigitalChannel touchsensor;
    private DcMotor motor;

    public void init(HardwareMap hwMap)  {}

    public DigitalChannel getTouchsensor() {
        touchsensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }



}

