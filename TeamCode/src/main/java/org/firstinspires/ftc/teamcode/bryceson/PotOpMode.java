package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.ProgrammingBoard5;
import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.Programmingboard6;

@TeleOp()
public class PotOpMode extends OpMode {
    Programmingboard6 board = new Programmingboard6();
    @Override
    public void init() {
        board.init(hardwareMap);
    }
    @Override
    public void loop() {
        telemetry.addData("Pot Angle", board.getPotAngle());
    }
}
