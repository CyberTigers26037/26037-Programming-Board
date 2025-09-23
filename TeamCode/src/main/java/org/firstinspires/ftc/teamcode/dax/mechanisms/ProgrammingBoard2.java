package org.firstinspires.ftc.teamcode.dax.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard2 {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean getTouchSensorState() {
        if(!touchSensor.getState()){
            return true;
        }
        return false;
    }

    public boolean isTouchSensorReleased() {
        if(!touchSensor.getState()){
            return false;
        }
        return true;
    }
}