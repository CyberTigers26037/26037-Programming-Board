package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings ("unused")
@TeleOp (name="Braeden and Dax ArtifactCarouselTestOpMode")
public class ArtifactCarouselTestOpMode extends OpMode {
    private ArtifactCarousel carousel;
    private ArtifactDetector detector;

    @Override
    public void init() {
        carousel = new ArtifactCarousel(hardwareMap);
        detector = new ArtifactDetector(hardwareMap);
    }

    boolean intakeActive = false;

    @Override
    public void loop() {
        if (gamepad1.x) {
            if (intakeActive) {
                carousel.moveCarouselToIntakePosition(1);
            }
            else carousel.moveCarouselToFirePosition(1);
        }
        if (gamepad1.y) {
            if (intakeActive) {
                carousel.moveCarouselToIntakePosition(2);
            }
            else carousel.moveCarouselToFirePosition(2);
        }
        if (gamepad1.b) {
            if (intakeActive) {
                carousel.moveCarouselToIntakePosition(3);
            }
            else carousel.moveCarouselToFirePosition(3);
        }
        if (gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
        }
        telemetry.addData("intakeActive", intakeActive);
        telemetry.addData("ArtifactColor", detector.detectArtifactColor());
        telemetry.update();
    }
}

//Green is around 160 (145-180
//Purple is around 230 (225-240