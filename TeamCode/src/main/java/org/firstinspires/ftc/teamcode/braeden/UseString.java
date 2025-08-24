package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Braeden UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Braeden O'Toole";
        int myGrade = 9;
        telemetry.addData("Hello", myName);
        telemetry.addData("Grade", myGrade);

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