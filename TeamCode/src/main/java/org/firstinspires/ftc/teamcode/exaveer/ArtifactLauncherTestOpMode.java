package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer ArtifactLauncherTestOpMode")
public class ArtifactLauncherTestOpMode extends OpMode {
    private ArtifactLauncher launcher;

    @Override
    public void init() {
        launcher = new ArtifactLauncher(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.left_trigger > 0.1) {
            launcher.startFlywheelMotor(); // start flywheel motor
        }
        else {
            launcher.stopFlywheelMotor(); // stop flywheel motor
        }
        if (gamepad1.right_trigger > 0.1) {
            launcher.raiseFlipper(); // raise the flipper
        }
        else {
            launcher.parkFlipper(); // park the flipper
        }
        if (gamepad1.dpadUpWasPressed()) { // increase flywheel by 0.1
            launcher.adjustFlywheelPower(+ 0.1);
        }
        if (gamepad1.dpadDownWasPressed()) { // decrease flywheel by 0.1
            launcher.adjustFlywheelPower(- 0.1);
        }
        telemetry.addData("Wheel Power", launcher.getFlywheelPower());
        telemetry.update();
    }
}
