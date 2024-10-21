package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;



@TeleOp(name = "David & Nathan DavidNathanMotorOp")

public class DavidNathanMotorOp extends OpMode {
    DcMotor motor;


    public void init() {
motor = hardwareMap.get(DcMotor.class, "motor");

    }

        public void hardwareMap () {


        }
    @Override
        public void loop (){
        motor.setPower(gamepad1.left_stick_y);
        }


    }

