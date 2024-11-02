package org.firstinspires.ftc.teamcode.test;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subassembly.Elbow;
import org.firstinspires.ftc.teamcode.subassembly.Wrist;

@TeleOp
public class TestElbow extends OpMode {
    private Elbow elbow;
    @Override
    public void init() {
        elbow = new Elbow(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.x){
            elbow.zero();
        }
        elbow.adjustAngle(-gamepad1.left_trigger * 0.1);
        elbow.adjustAngle(gamepad1.right_trigger * 0.1);

        telemetry.addData("Elbow Angle", elbow.getCurrentAngle());
    }
}
