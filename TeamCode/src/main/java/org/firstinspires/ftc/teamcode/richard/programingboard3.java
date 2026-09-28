package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.Map;

public class programingboard3 {
    private DigitalChannel touchSensor;
    private DcMotor motor;

    private void init(HardwareMap hwmap){
        touchSensor = hwmap.get(DigitalChannel . class,  "touch_sensor");
        touchSensor . setMode(DigitalChannel.Mode.INPUT);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
    public boolean isTouchSensorPressed() {
    return  !touchSensor.getState();

    }

    public void setMoterSpeed(double speed) {
        motor.setPower(speed);
    }
}