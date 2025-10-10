package org.firstinspires.ftc.teamcode.nathan_lee;


import static org.firstinspires.ftc.ftccommon.internal.manualcontrol.ManualControlOpMode.isRunning;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name = "Nathan ArtifactIntakeTestOpMode")

public class ArtifactIntakeTestOpMode extends OpMode {
    private ArtifactIntake artifactIntake;

    @Override
    public void init() {
        artifactIntake = new ArtifactIntake(hardwareMap);
    }

    @Override
    public void loop(){
        if(gamepad1.aWasPressed()){
            if(!artifactIntake.isRunning()){
                artifactIntake.start();
            }
            else{
                artifactIntake.stop();
            }

        }


        telemetry.addData("Intake: ", artifactIntake.isRunning());
    }
}
