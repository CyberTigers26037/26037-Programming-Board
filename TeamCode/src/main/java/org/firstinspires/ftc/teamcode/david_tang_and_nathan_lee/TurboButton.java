package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// This is challenge 4.6
@TeleOp(name = "David & Nathan TurboButton")
public class TurboButton extends OpMode {


    public void init() {


    }

    public void loop() {

if(!gamepad1.a){

    double power = -gamepad1.left_stick_y * 0.5;
    telemetry.addData("Power of left stick is", power);

}
else{
    double power = -gamepad1.left_stick_y;
    telemetry.addData("Power of left stick is", power);

}
if(!gamepad1.b){

    telemetry.addData("X is", gamepad1.right_stick_x);
    telemetry.addData("Y is", -gamepad1.right_stick_y);


}
else{
    double powerY = -gamepad1.left_stick_y;
    double powerX = -gamepad1.left_stick_x;
    powerY = -gamepad1.right_stick_x;
    powerX = gamepad1.right_stick_y;

    telemetry.addData("X is", -powerX);
    telemetry.addData("Y is", -powerY);

}
    }
}