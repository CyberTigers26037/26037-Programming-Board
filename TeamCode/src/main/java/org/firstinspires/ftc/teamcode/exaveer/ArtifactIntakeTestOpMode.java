package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer ArtifactIntakeTestOpMode")
public class ArtifactIntakeTestOpMode extends OpMode {
    private ArtifactIntake artifactIntake;

    private boolean intakeRunning;

    @Override
    public void init() {
        artifactIntake = new ArtifactIntake(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.aWasPressed()){// stop intake if it is running and start it if it is not
            intakeRunning = !intakeRunning;
            if(intakeRunning) {
                artifactIntake.start();
            }
            else{
                artifactIntake.stop();
            }
        }
        telemetry.addData("Intake", artifactIntake.isRunning());
        telemetry.update();
    }


}
