package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.nettles.mechanisms.ProgrammingBoard2;

@SuppressWarnings("unused")
@TeleOp( name = "Nettles TouchSensorOpMode2")
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

