package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard4;

@TeleOp(name = " Joshua MotherOpMode")
public class MotorOpMode extends OpMode {
    ProgrammingBoarjoshuad4 board = new ProgrammingBoard4();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        board.setMotorSpeed(0.5);
    }
}