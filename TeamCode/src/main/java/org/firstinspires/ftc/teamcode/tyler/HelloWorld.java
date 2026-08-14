package org.firstinspires.ftc.teamcode.tyler;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "tyler hello world")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","Tyler");
    }

    @Override
    public void loop(){
    }



}
