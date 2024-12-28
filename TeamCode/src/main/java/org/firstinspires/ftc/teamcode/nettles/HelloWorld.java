package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous()
public class HelloWorld extends OpMode{
    @Override
    public void init(){
        telemetry.addData("Hello", "Kip");
    }
    @Override
    public void loop(){

    }
}
