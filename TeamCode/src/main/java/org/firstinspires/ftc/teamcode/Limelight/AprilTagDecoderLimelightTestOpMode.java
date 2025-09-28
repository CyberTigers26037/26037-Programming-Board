package org.firstinspires.ftc.teamcode.Limelight;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer.ArtifactDetector;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer, Jose & Bryceson AprilTagDecoderLimelightTestOpMode")
public class AprilTagDecoderLimelightTestOpMode extends OpMode {
    private String obeliskArtifactOrder;
    private AprilTagDecoderLimelight aprilTagDecoder;
    private ArtifactDetector detector;

    @Override
    public void init() {
        aprilTagDecoder = new AprilTagDecoderLimelight();
        aprilTagDecoder.init(hardwareMap);

        detector = new ArtifactDetector(hardwareMap);
    }

    @Override
    public void loop() {
        if (obeliskArtifactOrder == null){
            aprilTagDecoder.beginDetectingObelisk();
            obeliskArtifactOrder = aprilTagDecoder.findObeliskArtifactOrder();
            if (obeliskArtifactOrder != null) {
                aprilTagDecoder.endDetectingObelisk();
            }
        }
        if (obeliskArtifactOrder != null) {
            telemetry.addData("Obelisk Artifact Order: ", obeliskArtifactOrder);
        }
        telemetry.addData("Artifact Color", detector.detectArtifactColor());
        telemetry.update();
    }
}
