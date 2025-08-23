package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Braeden ClassMethod")
public class ClassMethodOpMode extends OpMode {

    @Override
    public void init() {
    }

    double squareInputWithSign(double input) {
        double output = input * input;
        if (input < 0) {
        output = output * -1;
        }
        return output;
    }

    @Override
    public void loop() {
    }
}
