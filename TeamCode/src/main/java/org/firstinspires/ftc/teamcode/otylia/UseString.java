package org.firstinspires.ftc.teamcode.otylia;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Otylia UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Otylia";

        telemetry.addData("Hello", myName);

        int grade = 96;

        telemetry.addData("Grade", grade);
    }
    @Override
    public void loop() {
        int x = 5;
        // x is visible here
        {
            int y = 4;
            // x and y are visible here
        }
        // only x is visible here
    }
}
