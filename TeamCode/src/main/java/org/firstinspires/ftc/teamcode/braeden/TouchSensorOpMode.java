package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.braeden.mechanisms.ProgrammingBoard1;

// Coach Anthony, 8/2026, Commenting out for now because Braeden is not actively doing software.
// @TeleOp(name = "Braeden TouchSensorOpMode1")
public class TouchSensorOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();
    @Override
    public void init() {
        board. init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("touch_sensor", board.getTouchSensorState());
    }
 }
