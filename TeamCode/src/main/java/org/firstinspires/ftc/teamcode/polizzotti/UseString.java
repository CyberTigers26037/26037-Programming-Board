package org.firstinspires.ftc.teamcode.polizzotti;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Polizzotti UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Matthew Polizzotti";
        int age = 47;

        telemetry.addData("Hello", myName);
        telemetry.addData("Age", age);
    }

    @Override
    public void loop() {

    }
    
}
