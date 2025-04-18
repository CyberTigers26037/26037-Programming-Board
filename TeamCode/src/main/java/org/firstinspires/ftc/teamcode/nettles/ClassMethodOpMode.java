package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@TeleOp(name = "Nettles ClassMethodOpMode")

public class ClassMethodOpMode extends OpMode{
    @Override
    public void init() {

    }
double squareInputsWithSign(double input){
        double output = input*input;
        if (input < 0){
            output = output *-1;
        }
        return output;
}
    @Override
    public void loop() {
        double leftAmount =  gamepad1.left_stick_x;
        double fwdAmount = -gamepad1.left_stick_y;

        telemetry.addData("Before X" , leftAmount);
        telemetry.addData(" Before Y" , fwdAmount);

        leftAmount = squareInputsWithSign(leftAmount);
        fwdAmount = squareInputsWithSign(fwdAmount);
        telemetry.addData("After X" , leftAmount);
        telemetry.addData("After Y" , fwdAmount);;

    }
}
