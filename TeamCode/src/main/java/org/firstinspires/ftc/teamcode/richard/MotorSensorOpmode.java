package org.firstinspires.ftc.teamcode.richard;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class MotorSensorOpmode extends OpMode {
    programmingBoard4 board = new programmingBoard4();



    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (board.isTouchSensorPressed()) {
            board.setMotorspeed(0.5);
        } else {
            board.setMotorspeed(0.0);
        }
        //t qwes4r5tr6t7y8u9i0o-\]67telemetry.addData("motor rotations", board.getMotorRotations());
    }
}
