package org.firstinspires.ftc.teamcode.polizzotti;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamepadOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        // Left stick.
        telemetry.addData("Left Stick X", gamepad1.left_stick_x);
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);

        // Right stick.
        telemetry.addData("Right Stick X", gamepad1.right_stick_x);
        telemetry.addData("Right Stick Y", gamepad1.right_stick_y);

        // Difference between left and right stick Y values.
        double difference = gamepad1.left_stick_y - gamepad1.right_stick_y;
        telemetry.addData("Difference between joysticks", difference);

        // Sum of left and right trigger values.
        double sumOfTriggers = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Sum of triggers", sumOfTriggers);

        // A button.
        boolean isAPressed = gamepad1.a;
        telemetry.addData("A button", gamepad1.a);
        telemetry.addData("Is A pressed", isAPressed);

        // B button.
        boolean isBPressed = gamepad1.b;
        telemetry.addData("B button", gamepad1.b);
        telemetry.addData("Is B pressed", isBPressed);
    }
    
}
