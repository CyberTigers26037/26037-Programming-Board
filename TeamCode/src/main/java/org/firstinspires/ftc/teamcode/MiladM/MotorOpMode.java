package org.firstinspires.ftc.teamcode.MiladM;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.jeremiah.ProgrammingBoard4;

@TeleOp(name="MiladMode")
public class MotorOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();

    @Override
    public void init() {
        board.init(hardwareMap);


    }

    @Override
    public void loop() {
        board.setMotorSpeed(0.5);
    }
}