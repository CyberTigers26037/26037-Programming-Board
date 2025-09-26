package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard4;

@TeleOp(name ="Dax MotorOpMode")
public class MotorOpMode extends OpMode {
    ProgrammingBoard4  board = new ProgrammingBoard4();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            board.setMotorSpeed(0.4);
        }
        else {
            board.setMotorSpeed(0);
        }
    }
}