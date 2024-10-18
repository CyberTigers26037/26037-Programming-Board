package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

@TeleOp(name = "David & Nathan OpModeLeeTang")

public class OpModeLeeTang extends OpMode {
    private DcMotor motor;

    public void init() {

    }

        public void hardwareMap () {


        }
@Override
        public void loop (){
        motor.setPower(gamepad1.right_stick_y);

        }

    }

