package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import java.util.List;

public class AprilTagDecoderLimelight {
    private Limelight3A limelight;
    private IMU imu;

    public void init(HardwareMap hardwareMap) {
        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        imu = hardwareMap.get(IMU.class, "imu");
        limelight.pipelineSwitch(0);
    }

    public void beginDetectingObelisk() {
        limelight.start();
    }

    public String findObeliskArtifactOrder() {
        /*
        LLResult result = limelight.getLatestResult();

        for (AprilTagDetection detection : currentDetections) {
            if (detection.id == 21) {
                return "Green Purple Purple";
            }
            if (detection.id == 22) {
                return "Purple Green Purple";
            }
            if (detection.id == 23) {
                return "Purple Purple Green";
            }
            visionPortal.close();
        }
         */
        return null;
    }

    public void endDetectingObelisk() {
        limelight.stop();
    }

}
