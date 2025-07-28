package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.exaveer_trevor.mechanisms.ProgrammingBoard8;

@Autonomous()
public class AutoState4 extends OpMode {
    enum State {
        START,
        SECOND_STEP,
        DONE
    }
    ProgrammingBoard8 board = new ProgrammingBoard8();
    State state = State.START;
    double lastTime;

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void start(){
        state = State.START;
        resetRuntime();
        lastTime = getRuntime();
    }

    @Override
    public void loop() {

    }
}
