package org.firstinspires.ftc.teamcode.Limelight;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AprilTagDecoderLimelight {
    private Limelight3A limelight;

    public void init(HardwareMap hardwareMap) {
        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        limelight.pipelineSwitch(0);
    }

    public void beginDetectingObelisk() {
        limelight.start();
    }

    public String findObeliskArtifactOrder() {
        LLResult result = limelight.getLatestResult();

        if (result != null && result.isValid()) {
            for (LLResultTypes.FiducialResult detection : result.getFiducialResults()) {
                int id = detection.getFiducialId();
                if (id == 21) {
                    return "Green Purple Purple";
                } else if (id == 22) {
                    return "Purple Green Purple";
                } else if (id == 23) {
                    return "Purple Purple Green";
                }
            }
        }
        return null;
    }

    public void endDetectingObelisk() {
        limelight.stop();
    }

}
