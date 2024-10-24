package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class ProgrammingBoardTwo {
    private TouchSensor touchSensor;
    public void init(HardwareMap hwMap){
        touchSensor = hwMap.get(TouchSensor.class, "touch_sensor");
    }
    public boolean isTouchSensorPressed() {
        return touchSensor.isPressed();
    }

}
