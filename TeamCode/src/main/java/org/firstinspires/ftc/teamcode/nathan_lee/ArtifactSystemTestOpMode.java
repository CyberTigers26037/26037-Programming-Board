package org.firstinspires.ftc.teamcode.nathan_lee;




import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;






@SuppressWarnings("unused")
@TeleOp(name = "Nathan ArtifactSystemTestOpMode")
public class ArtifactSystemTestOpMode extends OpMode {
    private ArtifactSystem artifactSystem;




    @Override
    public void init() {
        artifactSystem = new ArtifactSystem(hardwareMap);
    }




    @Override
    public void loop() {




        if (gamepad1.left_trigger > 0.1) {
            artifactSystem.startLauncher();
            // TODO: write code to start the launcher
        }
        else {
            // TODO: write code to stop the launcher
            artifactSystem.stopLauncher();
        }




        if (gamepad1.dpadUpWasPressed()) {
            artifactSystem.adjustLauncherPower(+ 1);
            // TODO: write code to increase launcher power by 0.1
        }




        if (gamepad1.dpadDownWasPressed()) {
            artifactSystem.adjustLauncherPower(- 1);
            // TODO: write code to decrease launcher power by 0.1
        }




        if (gamepad1.aWasPressed()) {
            artifactSystem.toggleIntake();
            artifactSystem.moveCarouselToPosition(1);
            // TODO: write code to toggle the intake on/off
        }


        if (gamepad1.xWasPressed() && gamepad1.back){
            artifactSystem.moveCarouselToPosition(1);
            artifactSystem.detectArtifactColor1();
            artifactSystem.startIntake();
        }
        if (gamepad1.yWasPressed() && gamepad1.back){
            artifactSystem.moveCarouselToPosition(2);
            artifactSystem.detectArtifactColor2();
            artifactSystem.startIntake();
        }
        if (gamepad1.bWasPressed() && gamepad1.back){
            artifactSystem.moveCarouselToPosition(3);
            artifactSystem.detectArtifactColor3();
            artifactSystem.startIntake();
        }








        if (gamepad1.right_trigger > 0.1) {
            artifactSystem.raiseFlipper();
            // TODO: write code to raise the flipper
        }
        else {
            artifactSystem.parkFlipper();
            // TODO: write code to park the flipper
        }




        if (gamepad1.xWasPressed()) {
            artifactSystem.moveCarouselToPosition(1);
            // TODO: write code to move the carousel to position 1
        }
        if (gamepad1.yWasPressed()) {
            artifactSystem.moveCarouselToPosition(2);
            // TODO: write code to move the carousel to position 2
        }
        if (gamepad1.bWasPressed()) {
            artifactSystem.moveCarouselToPosition(3);
            // TODO: write code to move the carousel to position 3
        }




        telemetry.addData("Intake Position 1 color X button: ", artifactSystem.detectArtifactColor1());
        telemetry.addData("Intake Position 2 color Y button: ", artifactSystem.detectArtifactColor2());
        telemetry.addData("Intake Position 3 color B button: ", artifactSystem.detectArtifactColor3());
        telemetry.addData("Fly Wheel Power: ",artifactSystem.getLauncherPower());
        telemetry.addData("Intake Running: ", artifactSystem.isIntakeRunning());
        telemetry.addData("Launcher Running: ", artifactSystem.isLauncherRunning());
        // TODO: write code to display the following things on the n screen (telemetry):
        //   Launcher flywheel power
        //   Whether the intake is running
        //   Whether the launcher is running
    }
}
