package org.firstinspires.ftc.teamcode.Lilliana;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name="Lilliana HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void  init() {
        telemetry.addData("Hello","lilliana") ;
    }

    @Override
    public void loop() {

    }
}
//comment
