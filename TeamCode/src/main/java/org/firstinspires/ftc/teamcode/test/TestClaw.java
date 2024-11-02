package org.firstinspires.ftc.teamcode.test;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subassembly.Claw;

@TeleOp
public class TestClaw extends OpMode {

    private Claw claw;

    public void init() {

        claw = new Claw(hardwareMap);

        claw.zero();
    }

    @Override
    public void loop() {
        if(gamepad1.b){

            claw.dropSample();

        }
        if(gamepad1.x){
            claw.pickupSample();

        }
        if(gamepad1.a){
            claw.prepareToPickupVerticalSample();

        }
        if (gamepad1.y){
            claw.prepareToPickupHorizontalSample();

        }

    }
}
