package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.hardware.lynx.commands.core.LynxI2cConfigureChannelCommand;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class programingboard3 {
    private DigitalChannel touchSensor;
    private DcMotor moter;

    private void init(HardwareMap hwmap) {
        touchSensor = hwmap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        moter = hwmap.get(DcMotor.class, "motor");
        moter.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }


    public void setMotorSpeed(double speed) {
        moter.setPower(speed);
    }

}







