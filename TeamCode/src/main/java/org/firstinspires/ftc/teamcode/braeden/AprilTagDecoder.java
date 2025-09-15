package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.List;


public class AprilTagDecoder {
    private AprilTagProcessor aprilTag;
    private VisionPortal visionPortal;

    public void init(HardwareMap hardwareMap) {
        // Create the AprilTag processor the easy way.
        aprilTag = AprilTagProcessor.easyCreateWithDefaults();

        // Create the vision portal the easy way.
        visionPortal = VisionPortal.easyCreateWithDefaults(
                hardwareMap.get(WebcamName.class, "Webcam 1"), aprilTag);
    }

    public void beginDetectingObelisk() {
        visionPortal.resumeStreaming();
    }

    public String findObeliskArtifactOrder() {
        List<AprilTagDetection> currentDetections = aprilTag.getDetections();

        // Step through the list of detections and display info for each one.
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
        }
        return null;
    }

    public void endDetectingObelisk() {
        visionPortal.stopStreaming();
    }
}

//:D