package org.firstinspires.ftc.teamcode.yuchen_lin;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Hello")
public class HelloWorld2 extends OpMode {
    public void init() {

        telemetry.addData("Hellow", "67");
    }
    @Override
    public void loop() {

    }
}

