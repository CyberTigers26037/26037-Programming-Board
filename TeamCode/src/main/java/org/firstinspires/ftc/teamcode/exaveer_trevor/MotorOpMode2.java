package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer_trevor.ProgrammingBoard4;

@TeleOp(name = "Trevor & Exaveer MotorOpMode")
public class MotorOpMode2 extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        board.setMotorSpeed(0.5);
        telemetry.addData("Motor rotations", board.getMotorRotations());
    }
}
