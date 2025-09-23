package org.firstinspires.ftc.teamcode.Limelight;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class LimeLightAprilTag {
    private Limelight3A limelight;
    private IMU imu;

    public void init(HardwareMap hardwareMap) {
        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        imu = hardwareMap.get(IMU.class, "imu");

    }
    public void beginDetectingObelisk() {
        limelight.pipelineSwitch(0);
        limelight.start();
    }

    public void beginDetectTeamBlue() {
        limelight.pipelineSwitch(1);
        limelight.start();
    }

    public void beginDetectTeamRed() {
        limelight.pipelineSwitch(2);
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

    public double detectGoalAngle(){
        LLResult result = limelight.getLatestResult();

        if (result != null && result.isValid()) {
            return result.getTx();
        }
       return 0;
    }

    public void endStreaming() {
        limelight.stop();
    }

}


