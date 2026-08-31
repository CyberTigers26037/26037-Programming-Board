package org.firstinspires.ftc.teamcode.polizzotti;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Polizzotti IfOpMode2")
public class IfOpMode2 extends OpMode {
    @Override
    public void init() {
    }

    public void loop() {
        // When the "A" button is pressed.
        if (gamepad1.a) {
            telemetry.addData("A Button", "pressed");
        }
    }
}
