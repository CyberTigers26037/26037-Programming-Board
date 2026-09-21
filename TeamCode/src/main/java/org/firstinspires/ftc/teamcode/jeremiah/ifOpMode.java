package org.firstinspires.ftc.teamcode.jeremiah;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Jeremiah if OpMode")
public class ifOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0){
            telemetry.addData("left stick", "is negative");
        }

        telemetry.addData("left stick y", gamepad1.left_stick_y);
    }

}








