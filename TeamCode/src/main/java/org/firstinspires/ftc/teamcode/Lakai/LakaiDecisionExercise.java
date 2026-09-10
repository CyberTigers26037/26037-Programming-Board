package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Lakai Decision Exercise")
public class LakaiDecisionExercise extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if(gamepad1.a){
            double speedForward = -gamepad1.left_stick_y;
            telemetry.addData("Left stick Y", gamepad1.left_stick_y);
            telemetry.addData("speed Forward", speedForward);
        }
        else {
            double speedForward = -gamepad1.left_stick_y / 2.0;
            telemetry.addData("Left stick Y", gamepad1.left_stick_y);
            telemetry.addData("speed Forward", speedForward);
        }

    }
}
