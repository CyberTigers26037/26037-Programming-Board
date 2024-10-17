package org.firstinspires.ftc.teamcode.otylia;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class HelloWorld extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {
        telemetry.addData("Hello", "Otylia");
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
        // intentionally left blank
    }
}
