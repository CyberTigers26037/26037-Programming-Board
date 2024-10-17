package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "UseString", group = "david and nathan")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Nathan Lee";
        String myGrade = "9";

        telemetry.addData("Hello", myName);
        telemetry.addData("Grade", myGrade);
    }
    @Override
    public void loop() {

    }
}
