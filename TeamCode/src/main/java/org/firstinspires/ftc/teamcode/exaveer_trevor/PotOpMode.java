package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer_trevor.mechanisms.ProgrammingBoard5;
import org.firstinspires.ftc.teamcode.exaveer_trevor.mechanisms.ProgrammingBoard6;

public class PotOpMode extends OpMode {
    ProgrammingBoard6 board = new ProgrammingBoard6();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Pot Angle", board.getPotAngle());
    }

    //excirsise 9.4
}
