package org.firstinspires.ftc.teamcode.richard;

import android.text.method.Touch;

import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class programmingBoard4 {
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double tickperRotation;
    private Servo servo;
    private AnalogInput pot;


    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touchSensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        tickperRotation = motor.getMotorType().getTicksPerRev();
        servo = hwMap.get(Servo.class, "servo");
        pot = hwMap.get(AnalogInput.class, "pot");
    }

    public boolean isTouchSensorPressed() {
        return  !touchSensor.getState();
    }
    public void setMotorspeed(double speed) {
        motor.setPower(speed);

    }




}
