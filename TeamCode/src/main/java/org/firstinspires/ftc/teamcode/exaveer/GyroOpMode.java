package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard8;

@TeleOp(name = "Exaveer GyroOpMode")
public class GyroOpMode extends OpMode {
    ProgrammingBoard8 board = new ProgrammingBoard8();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Our Heading", board.getHeading(AngleUnit.DEGREES));
    }
}
