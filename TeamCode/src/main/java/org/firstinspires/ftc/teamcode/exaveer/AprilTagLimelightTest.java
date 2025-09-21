package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer Limelight Test")
public class AprilTagLimelightTest extends OpMode {
    private Limelight3A limelight;

    @Override
    public void init() {
        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        limelight.pipelineSwitch(0);
    }

    @Override
    public void start() {
        limelight.start();
    }

    @Override
    public void loop() {
        LLResult llResult = limelight.getLatestResult();
        if (llResult != null && llResult.isValid()) {
            for (LLResultTypes.FiducialResult fr : llResult.getFiducialResults()) {
                telemetry.addData("AprilTag ID", fr.getFiducialId());
            }
        }
        else {
            telemetry.addData("AprilTag ID", "None");
        }
    }
}
