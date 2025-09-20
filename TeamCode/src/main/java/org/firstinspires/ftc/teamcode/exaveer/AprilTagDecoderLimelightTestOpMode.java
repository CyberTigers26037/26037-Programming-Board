package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer, Jose & Bryceson AprilTagDecoderLimelightTestOpMode")
public class AprilTagDecoderLimelightTestOpMode extends OpMode {
    private String obeliskArtifactOrder;
    private AprilTagDecoderLimelight aprilTagDecoder;

    @Override
    public void init() {
        aprilTagDecoder = new AprilTagDecoderLimelight();
        aprilTagDecoder.init(hardwareMap);
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
        telemetry.update();
    }
}
