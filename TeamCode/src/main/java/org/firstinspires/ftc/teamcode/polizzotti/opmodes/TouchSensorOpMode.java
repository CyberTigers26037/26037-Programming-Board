package org.firstinspires.ftc.teamcode.polizzotti.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.polizzotti.mechanisms.ProgrammingBoard1;

@TeleOp(name="Polizzotti TouchSensorOpMode")
public class TouchSensorOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();

    @Override
    public void init() {
        // Initialize our programming board.
        // The hardwareMap is provided by OpMode and is how
        // we see the robot is configured.
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        // Send the state of the touch sensor.
        telemetry.addData("Touch sensor", board.getTouchSensorState());
    }
}
