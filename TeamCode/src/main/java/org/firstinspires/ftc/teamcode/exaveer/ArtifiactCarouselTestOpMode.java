package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Exaveer ArtifiactCarouselTestOpMode")
public class ArtifiactCarouselTestOpMode extends OpMode {
    private ArtifactCarousel carousel;
    private ArtifactDetector detector;

    boolean intakeActive = false;

    @Override
    public void init() {
        carousel = new ArtifactCarousel(hardwareMap);
        detector = new ArtifactDetector(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
        }
        if(intakeActive) {
            if(gamepad1.x) {
                carousel.moveCarouselToIntakePosition(1); //pos1 -90 degrees
            }
            if(gamepad1.y) {
                carousel.moveCarouselToIntakePosition(2); //pos2 -60 degrees
            }
            if(gamepad1.b) {
                carousel.moveCarouselToIntakePosition(3); //pos3 -30 degrees
            }
        }
        else {
            if(gamepad1.x) {
                carousel.moveCarouselToFirePosition(1); //pos1 -90 degrees
            }
            if(gamepad1.y) {
                carousel.moveCarouselToFirePosition(2); //pos2 -60 degrees
            }
            if(gamepad1.b) {
                carousel.moveCarouselToFirePosition(3); //pos3 -30 degrees
            }
        }

        telemetry.addData("Mode", intakeActive);
        telemetry.addData("Artifact Color", detector.detectArtifactColor());
        telemetry.update();
    }
}
