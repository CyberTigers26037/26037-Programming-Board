package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Lakai UseRobotLocationOpmode")
public class LakaiUseRobotLocationOpmode extends OpMode {
    LakaiRobotLocation robotLocation = new LakaiRobotLocation(0);

    @Override
    public void init() {
        robotLocation.setAngle(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            robotLocation.turn(0.1);
        }


    }
}
