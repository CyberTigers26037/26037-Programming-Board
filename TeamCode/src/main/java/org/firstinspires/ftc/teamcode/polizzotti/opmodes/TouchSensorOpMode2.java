package org.firstinspires.ftc.teamcode.polizzotti.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.polizzotti.mechanisms.ProgrammingBoard1;
import org.firstinspires.ftc.teamcode.polizzotti.mechanisms.ProgrammingBoard2;

@TeleOp(name="Polizzotti TouchSensorOpMode2")
public class TouchSensorOpMode2 extends OpMode {
    ProgrammingBoard2 board = new ProgrammingBoard2();

    @Override
    public void init() {
        // Initialize our programming board.
        // The hardwareMap is provided by OpMode and is how
        // we see the robot is configured.
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Touch sensor (pressed): ", board.isTouchScreenPressed());
        telemetry.addData("Touch Sensor (released): ", board.isTouchScreenReleased());
    }
}
