package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="exaveer GamepadRumbleBlipsOpMode")
public class GamepadRumbleBlipsOpMode extends OpMode {
    boolean wasA;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if (gamepad1.a && !wasA) {
            gamepad1.rumbleBlips(3);
        }
        wasA = gamepad1.a;
    }
}
