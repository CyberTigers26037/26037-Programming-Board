package org.firstinspires.ftc.teamcode.bryceson;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.bryceson.ArtifactCarousel;

@SuppressWarnings("unused")
@TeleOp(name = "Bryceson ArtifactCarouselTestOpMode")
public class ArtifactCarouselTestOpMode extends OpMode {
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
        if (intakeActive) {
            if (gamepad1.x) {
                carousel.moveCarouselToIntakePosition(1);
            }
            if (gamepad1.y) {
                carousel.moveCarouselToIntakePosition(2);
            }
            if (gamepad1.b) {
                carousel.moveCarouselToIntakePosition(3);
            }
        }
        else {
            if (gamepad1.x) {
                carousel.moveCarouselToFirePosition(1);
            }
            if (gamepad1.y) {
                carousel.moveCarouselToFirePosition(2);
            }
            if (gamepad1.b) {
                carousel.moveCarouselToFirePosition(3);
            }
        }
        if (gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
        }
        telemetry.addData("intake Active", intakeActive);
        telemetry.addData("Artifact Color", detector.detectArtifactColor());
        // get the hues of green and purple.
    }
}
