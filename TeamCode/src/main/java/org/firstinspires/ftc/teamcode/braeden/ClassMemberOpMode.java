package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Braeden ClassMemberOpMode")
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
