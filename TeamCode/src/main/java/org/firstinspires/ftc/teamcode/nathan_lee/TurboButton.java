package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan Lee TurboButton")
public class TurboButton extends OpMode {
    @Override
    public void init(){}
    public void loop(){

    if(!gamepad1.a){
        double power = -gamepad1.left_stick_y * 0.5;
        telemetry.addData("Tubo button pressed!", power);
    }
    else{
        double power = -gamepad1.left_stick_y;
        telemetry.addData("Turbo button not pressed!", power);
    }
    if(gamepad1.a){

        telemetry.addData("x is", gamepad1.y);
        telemetry.addData("y is", gamepad1.x);
    }
    else{
        telemetry.addData("joystick is  normal....", gamepad1);
    }

    }
}
