package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Braeden is not actively doing software.
// @TeleOp(name = "Braeden ClassMemberOpMode")
public class ClassMemberOpMode extends OpMode {
    boolean initDone;

    @Override
    public void init() {
        telemetry.addData("init Done", initDone);
        {
        }
    }

    @Override
    public void loop() {

    }
}
