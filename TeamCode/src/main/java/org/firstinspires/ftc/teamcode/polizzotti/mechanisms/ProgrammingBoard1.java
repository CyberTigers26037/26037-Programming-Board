package org.firstinspires.ftc.teamcode.polizzotti.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard1 {
    private DigitalChannel touchSensor;

    /**
     * Initialize the touchSensor.
     * @param hwMap
     */
    public void init(HardwareMap hwMap) {
        // Assigns the hardware that is in the configuration file.
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        // We are reading from the touch sensor so we need to set it as INPUT.
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    /**
     * Getter for touchSensor
     * @return touchSensor
     */
    public boolean getTouchSensorState() {
        return touchSensor.getState();
    }
}
