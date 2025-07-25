package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Trevor & Exaveer MotorOpMode")
public class MotorOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        board.setMotorSpeed(0.5);
    }
}
