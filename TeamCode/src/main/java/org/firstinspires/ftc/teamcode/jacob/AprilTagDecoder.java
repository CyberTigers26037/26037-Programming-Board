package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.List;

public class AprilTagDecoder {

    /**
     * The variable to store our instance of the AprilTag processor.
     */
    private AprilTagProcessor aprilTag;

    /**
     * The variable to store our instance of the vision portal.
     */
    private VisionPortal visionPortal;
    public String findObeliskArtifactOrder() { List<AprilTagDetection> currentDetections = aprilTag.getDetections();


        // Step through the list of detections and display info for each one.
        for (AprilTagDetection detection : currentDetections) {
            if (detection.id == 21) {
                return "Green, Purple, Purple";

            } else if (detection.id == 22) {
                return "Purple, Green, Purple";

            } else if (detection.id == 23) {
                return "Purple, Purple, Green";

            }

        }
        return null;
    }

    public void endDetectingObelisk() { visionPortal.stopStreaming();
        visionPortal.resumeStreaming();
    }

    public void beginDetectingObelisk() {
    }

    public void init(HardwareMap hardwareMap) { // Create the AprilTag processor the easy way.
        aprilTag = AprilTagProcessor.easyCreateWithDefaults();

        // Create the vision portal the easy way.

        visionPortal = VisionPortal.easyCreateWithDefaults(
                    hardwareMap.get(WebcamName.class, "Webcam 1"), aprilTag);



    }
}
