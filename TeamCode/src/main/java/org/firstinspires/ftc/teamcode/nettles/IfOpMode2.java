
package org.firstinspires.ftc.teamcode.nettles;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@TeleOp(name = "Nettles IfOpMode2")

public class IfOpMode2 extends OpMode {
@Override
public void init(){
}
@Override
    public void loop() {
    if(gamepad1.a){
        telemetry.addData("A Button" , "pressed");
    }
}
}