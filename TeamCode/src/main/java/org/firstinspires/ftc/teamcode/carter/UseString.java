package org.firstinspires.ftc.teamcode.carter;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Carter UseString")
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Carter Armstrong";

        telemetry.addData("Hello", myName);
    }

    @Override
    public void loop() {
        int x = 5;
        {
            int y = 4;
        }
    }
}
/*return to page 17/
lebron da goat btw
 */