package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name = "Nathan Lee AprilTagDecoderTestOpMode")
public class AprilTagDecoderTestOpMode extends OpMode {
    private String obeliskArtifactOrder;
    private AprilTagDecoder aprilTagDecoder;


    @Override
    public void init() {
        aprilTagDecoder = new AprilTagDecoder();
        aprilTagDecoder.init(hardwareMap);
    }



    @Override
    public void loop() {
        if (obeliskArtifactOrder == null) {
            aprilTagDecoder.beginDetectingObelisk();
            obeliskArtifactOrder = aprilTagDecoder.findObeliskArtifactOrder();
        if (obeliskArtifactOrder != null) {
            aprilTagDecoder.endDetectingObelisk();
        }
    }
        if (obeliskArtifactOrder != null) {
            telemetry. addData("Obelisk Artifact Order: ", obeliskArtifactOrder);
        telemetry.update();
            }
        }
}


