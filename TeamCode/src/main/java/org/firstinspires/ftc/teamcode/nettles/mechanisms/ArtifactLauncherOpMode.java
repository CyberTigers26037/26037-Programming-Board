package org.firstinspires.ftc.teamcode.nettles.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.nettles.mechanisms.ArtifactLauncher;

//suppresses the warning of a line being unused which often happens
@SuppressWarnings("unused")
//Declares this class to be TeleOp on the Control Hub and Names it.
@TeleOp( name = "AA_Nettles ArtifactLauncherOpMode")
//Declares the security of the class and extends the OpMode from FTC
// which requires the 2 methods.
public class ArtifactLauncherOpMode extends OpMode{
    private ArtifactLauncher launcher;

    @Override
    public void init() {
       launcher = new ArtifactLauncher(hardwareMap);
    }
    public void loop(){
    if (gamepad1.dpadUpWasPressed()){
        launcher.adjustFlywheelPower(0.1);
    }
    if (gamepad1.dpadDownWasPressed()) {
        launcher.adjustFlywheelPower(-0.1);
    }
    if (gamepad1.right_trigger>0.1) {
        launcher.startFlywheelMotor();
    }
    telemetry.addData("FlyWheelPower", launcher.getFlywheelPower());
    }
}