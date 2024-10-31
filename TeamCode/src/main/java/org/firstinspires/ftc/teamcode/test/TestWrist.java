package org.firstinspires.ftc.teamcode.test;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subassembly.Wrist;

@TeleOp
public class TestWrist extends OpMode {
    private Wrist wrist;
    @Override
    public void init() {
        wrist = new Wrist(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.x){
            wrist.zero();
        }
        wrist.adjustAngle(-gamepad1.left_trigger);
        wrist.adjustAngle(gamepad1.right_trigger);
    }
}
