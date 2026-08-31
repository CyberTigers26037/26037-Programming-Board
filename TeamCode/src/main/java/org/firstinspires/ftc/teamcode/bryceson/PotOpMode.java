package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.ProgrammingBoard5;
import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.Programmingboard6;

// Coach Anthony, 8/2026, Commenting out for now because Bryceson is not actively doing software.
// @TeleOp(name="Bryceson PotOpMode")
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
