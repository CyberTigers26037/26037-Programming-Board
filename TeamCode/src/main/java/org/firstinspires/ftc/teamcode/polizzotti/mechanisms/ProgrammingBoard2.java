package org.firstinspires.ftc.teamcode.polizzotti.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard2 {
    private DigitalChannel touchSensor;

    /**
     * Initialize the touchSensor.
     * @param hwMap
     */
    public void init(HardwareMap hwMap) {
        // Assigns the hardware that is in the configuration file.
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        // Set the channel as input as we want to read from the touch sensor.
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    /**
     * Handler reports on pressed state of touch screen.
     * @return touchSensor state.
     */
    public boolean isTouchScreenPressed() {
        return !touchSensor.getState();
    }

    /**
     * Handler reports on released state of touch screen.
     * @return touchSensor state.
     */
    public boolean isTouchScreenReleased() {
        return touchSensor.getState();
    }
}
