package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard7;


@TeleOp(name = "Exaveer DistanceColorOpMode")
public class DistanceColorOpMode extends OpMode {
    ProgrammingBoard7 board = new ProgrammingBoard7();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Amount red", board.getAmountRed());
        telemetry.addData("Distance (CM)", board.getDistance(DistanceUnit.CM));
        telemetry.addData("Amount red", board.getDistance(DistanceUnit.INCH));
    }
}
