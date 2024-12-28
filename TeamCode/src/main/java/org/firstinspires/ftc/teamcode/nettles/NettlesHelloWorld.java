package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous(name = "Nettles HelloWorld")

public class NettlesHelloWorld extends OpMode{
    @Override
    public void init(){
        telemetry.addData("Hello", "Kip");
    }
    @Override
    public void loop(){

    }
}
