package org.firstinspires.ftc.teamcode.polizzotti.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard3 {
    private DigitalChannel touchSensor;
    private DcMotor motor;

    /**
     * Initialize the touchSensor and motor.
     * @param hwMap
     */
    public void init(HardwareMap hwMap) {
        // Assign the sensor from the configuration file.
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        // Set the channel as input as we want to read from the touch sensor.
        touchSensor.setMode(DigitalChannel.Mode.INPUT);

        // Assign the motor from the configuration file.
        motor = hwMap.get(DcMotor.class, "motor");
        // Assign how we want to use the motor.
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    /**
     * Handler returns when touch sensor is pressed.
     * @return {boolean}
     */
    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    /**(
     * Set the speed of the motor.
     * @param speed the speed to set
     */
    public void setMotorSpeed(double speed) {
        // Takes a double between -1.0 and 1.0.
        // -1.0 is full speed backwards.
        // 0.0 is stopped.
        // 1.0 is full speed forwards.
        motor.setPower(speed);
    }
}
