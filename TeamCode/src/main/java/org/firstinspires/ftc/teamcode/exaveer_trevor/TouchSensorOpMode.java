package org.firstinspires.ftc.teamcode.exaveer_trevor;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer_trevor.ProgrammingBoard1;

@TeleOp(name = "Trevor & Exaveer TouchSensorOpMode")
public class TouchSensorOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Touch sensor", board.getTouchSensorState());
    }
}
