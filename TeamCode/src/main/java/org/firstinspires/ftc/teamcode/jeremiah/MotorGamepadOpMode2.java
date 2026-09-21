package org.firstinspires.ftc.teamcode.jeremiah;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MotorGamepadOpMode2")
public class MotorGamepadOpMode2 extends OpMode {
    ProgrammingBoard4 board  = new ProgrammingBoard4();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorspeed = gamepad1.left_stick_y;

        board.setMotorSpeed(motorspeed);

        telemetry.addData("Motor speed", motorspeed);
        telemetry.addData("Motor rotations", board.getMotorRotations());
    }
    double squareInputWithSign(double input){
        double output = input * input;
        if(input < 0){
            output = output * -1;
        }
        return output;
    }
}
