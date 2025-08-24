package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "David & Nathan TouchSensorOpMode")

public class TouchSensorOpMode extends OpMode {

    ProgrammingBoardTwo board = new ProgrammingBoardTwo();

@Override

    public void init(){
board.init(hardwareMap);


    }

    public void loop(){
    if(board.isTouchSensorPressed()){
       telemetry.addData("Touch Sensor", "Pressed");


    }
    else {
        telemetry.addData("Touch Sensor", "Not Pressed");

    }

        }
    }


