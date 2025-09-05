package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name= "exaveer GamepadRumbleOpMode")
public class GamepadRumbleOpMode extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop() {
        telemetry.addLine("Press left trigger for left rumble, and right trigger for right rumble");
                gamepad1.rumble(gamepad1.left_trigger, gamepad1.right_trigger, Gamepad.RUMBLE_DURATION_CONTINUOUS);
    }
}