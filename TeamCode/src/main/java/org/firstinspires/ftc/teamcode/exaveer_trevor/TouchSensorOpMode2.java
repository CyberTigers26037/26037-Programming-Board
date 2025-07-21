package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Trevor & Exaveer TouchSensorOpMode2")
public class TouchSensorOpMode2 extends OpMode {
    ProgrammingBoard2 board = new ProgrammingBoard2();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        if (board.isTouchSensorPressed()) {
            telemetry.addData("Touch sensor", "Pressed");
        }
        else {
            telemetry.addData("Touch sensor", "Not Pressed");
        }
    }

}