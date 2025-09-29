package org.firstinspires.ftc.teamcode.jeremiah;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class listing extends OpMode{
    @Override
    public void init() {
        String myName= "Jacob Riley";

        telemetry.addData("Hello",myName);
    }

    @Override
    public void loop() {

    }
}
