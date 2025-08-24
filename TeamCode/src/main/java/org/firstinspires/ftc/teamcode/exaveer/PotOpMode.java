package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard6;

@TeleOp(name = "Exaveer PotOpMode")
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
