package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.ProgrammingBoard5;

// Coach Anthony, 8/2026, Commenting out for now because Bryceson is not actively doing software.
// @TeleOp(name="Bryceson ServoGamepadOpMode")
public class ServoGamepadOpMode extends OpMode {
    ProgrammingBoard5 board = new ProgrammingBoard5();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            board.setServoPosition(1.0);
        }
        else if(gamepad1.b) {
            board.setServoPosition(0.0);
        }
        else{
            board.setServoPosition(0.5);
        }
    }
}
