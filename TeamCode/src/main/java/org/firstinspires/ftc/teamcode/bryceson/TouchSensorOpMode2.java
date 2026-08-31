package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.ProgrammingBoard2;

// Coach Anthony, 8/2026, Commenting out for now because Bryceson is not actively doing software.
// @TeleOp (name = "Bryceson TouchSensorOpMode2")
public class TouchSensorOpMode2 extends OpMode {
    ProgrammingBoard2 board = new ProgrammingBoard2();
    @Override
    public void init() {
        board.init(hardwareMap);
    }
    @Override
    public void loop() {
        telemetry.addData("Touch pressed", board.isTouchSensorPressed());
    }
}
