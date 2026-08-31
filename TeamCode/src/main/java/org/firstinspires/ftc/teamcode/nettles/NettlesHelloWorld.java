package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Mr. Nettles is not actively doing software.
// @Autonomous(name = "Nettles HelloWorld")

public class NettlesHelloWorld extends OpMode{
    @Override
    public void init(){
        telemetry.addData("Hello", "Kip");
    }
    @Override
    public void loop(){

    }
}
