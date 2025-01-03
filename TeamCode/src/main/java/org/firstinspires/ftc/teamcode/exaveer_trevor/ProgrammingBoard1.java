package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard1 {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap){
        touchSensor = hwMap.get(DigitalChannel.class, "touch_senor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean getTouchSensorState() {
        return touchSensor.getState();
    }
}
