package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Dax is not actively doing software.
// @TeleOp(name ="Dax ClassMemberOpMode")
public class ClassMemberOpMode extends OpMode {
    boolean initDone;

    @Override
    public void init() {
        telemetry.addData("init Done", initDone);
        initDone = true;
    }

    @Override
    public void loop() {
        telemetry.addData("init Done", initDone);
    }
}