package org.firstinspires.ftc.teamcode.nettles.mechanisms;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@SuppressWarnings("unused")
@TeleOp(name="AA-Nettles ArtifactCarouselTestOpMode")
public class ArtifactCarouselTestOpMode extends OpMode {
    private ArtifactDetector detector;
    private ArtifactCarousel carousel;
    boolean intakeActive = false;

    @Override
    public void init() {
        carousel = new ArtifactCarousel(hardwareMap);
        detector = new ArtifactDetector (hardwareMap);


    }

    @Override
    public void loop() {
        if (gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
        }
        telemetry.addData("intakeActive", intakeActive);
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

        } else {
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
        telemetry.addData("Artifact Color", detector.detectArtifactColor());
    }
}
