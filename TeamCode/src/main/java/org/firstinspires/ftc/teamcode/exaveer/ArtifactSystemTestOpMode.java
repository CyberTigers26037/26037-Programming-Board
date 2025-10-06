package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer ArtifactSystemTestOpMode")
public class ArtifactSystemTestOpMode extends OpMode {
    private ArtifactSystem artifactSystem;

    @Override
    public void init() {
        artifactSystem = new ArtifactSystem(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.left_trigger > 0.1){
            artifactSystem.startLauncher();
        }
        else{
            artifactSystem.stopLauncher();
        }

        if(gamepad1.dpadUpWasPressed()){
            artifactSystem.adjustLauncherPower(0.1);
        }

        if(gamepad1.dpadDownWasPressed()){
            artifactSystem.adjustLauncherPower(-0.1);
        }

        if(gamepad1.right_trigger > 0.1){
            artifactSystem.raiseFlipper();
        }
        else{
            artifactSystem.parkFlipper();
        }

        if(gamepad1.aWasPressed()){
            artifactSystem.toggleIntake();
        }
        if(gamepad1.xWasPressed()){
            artifactSystem.moveCarouselToPosition(1);
        }
        if(gamepad1.yWasPressed()){
            artifactSystem.moveCarouselToPosition(2);
        }
        if(gamepad1.bWasPressed()){
            artifactSystem.moveCarouselToPosition(3);
        }

        telemetry.addData("Wheel Power", artifactSystem.getLauncherPower());
        telemetry.addData("Intake", artifactSystem.isIntakeRunning());
        telemetry.addData("Launcher", artifactSystem.isLauncherRunning());
        telemetry.update();
    }
}
