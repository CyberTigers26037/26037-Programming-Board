package org.firstinspires.ftc.teamcode.jeremiah;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Ch3 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
double speedforward=-gamepad1.left_stick_y/2.0;
telemetry.addData("left stick y",gamepad1.left_stick_y);
telemetry.addData("speed Forward",speedforward);
    }
}
