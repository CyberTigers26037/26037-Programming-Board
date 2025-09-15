package org.firstinspires.ftc.teamcode.nathan_lee;


import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.List;


public class AprilTagDecoder {
    private AprilTagProcessor aprilTag;

    private VisionPortal visionPortal;


    public void beginDetectingObelisk(){

            visionPortal.resumeStreaming();

    }
    public String findObeliskArtifactOrder(){

        List<AprilTagDetection> currentDetections = aprilTag.getDetections();


        // Step through the list of detections and display info for each one.
        for (AprilTagDetection detection : currentDetections) {
            if (detection.id == 21) {
                return "Pattern: Green, Purple, Purple" ;
            } else if (detection.id == 22) {
                return "Pattern: Purple, Green, Purple";

            } else if (detection.id == 23) {
                return "Pattern: Purple, Purple, Green";
            }

        }
        return null;
    }
    public void endDetectingObelisk(){
        visionPortal.stopStreaming();
    }

    public void init(HardwareMap hardwareMap) {
        aprilTag = AprilTagProcessor.easyCreateWithDefaults();

        // Create the vision portal the easy way.

        visionPortal = VisionPortal.easyCreateWithDefaults(
                hardwareMap.get(WebcamName.class, "Webcam 1"), aprilTag);
    }
}