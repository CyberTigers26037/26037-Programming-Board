package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;

public class programingboard3 {
    private DigitalChannel touchSensor;
    private DcMotor moter;

    public void setTouchSensor(DigitalChannel touchSensor) {
        this.touchSensor = touchSensor;
        return;

    }
}
