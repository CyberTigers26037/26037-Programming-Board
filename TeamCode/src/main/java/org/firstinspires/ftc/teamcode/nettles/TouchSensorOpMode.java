package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.nettles.mechanisms.ProgrammingBoard1;
@SuppressWarnings("unused")
@TeleOp( name = "Nettles TouchSensorOpMode")
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

