package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.dax.mechanisms.ProgrammingBoard2;

@TeleOp(name ="DaxTouchSensorOpMode")
public class TouchSensorOpMode extends OpMode {
    ProgrammingBoard2 board = new ProgrammingBoard2();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("ButtonPressed",board.getTouchSensorState());
        if(board.getTouchSensorState()){
            telemetry.addLine("TouchSensor : Pressed");
        }
        else{
            telemetry.addLine("TouchSensor : Not Pressed");
        }
    }
}