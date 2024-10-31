package org.firstinspires.ftc.teamcode.test;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subassemblies.Pincher;

@TeleOp
public class TestPincher extends OpMode {

    private Pincher pincher;

    @Override
    public void init() {

        pincher = new Pincher(hardwareMap);

    }

    @Override
    public void loop() {

        if (gamepad1.x) {

            pincher.zero();
        }

        pincher.adjustAngle(-gamepad1.left_trigger);

        pincher.adjustAngle(gamepad1.right_trigger);

    }
}
