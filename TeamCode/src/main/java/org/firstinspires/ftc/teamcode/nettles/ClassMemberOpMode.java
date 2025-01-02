package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@TeleOp(name = "Nettles ClassMemberOpMode")

public class ClassMemberOpMode extends OpMode{
    boolean initDone;
    @Override
    public void init() {
        telemetry.addData("init Done" , initDone);
    initDone = true;
    }

    @Override
    public void loop() {
telemetry.addData("init Done" , initDone);
    }
}
