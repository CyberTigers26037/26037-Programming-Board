package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
// Coach Anthony, 8/2026, Commenting out for now because Jacob is not actively doing software.
// @TeleOp(name="Jacob UserString")
public class UseString extends OpMode {
    @Override
    public void init() {
String myName = "Jacob";
telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {

    }
}
