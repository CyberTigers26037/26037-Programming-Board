package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Lakai classmemberopmode")
public class LakaiClassMemberOpMode extends OpMode {
    boolean initDone;

    @Override
    public void init() {
        telemetry.addData("init Done", initDone);
        initDone = true;

    }

    @Override
    public void loop() {

    }
}
