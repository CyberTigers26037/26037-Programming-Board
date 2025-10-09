package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@SuppressWarnings("unused")
@TeleOp(name="nettles ArtifactCarouselTestOpMode")
public class ArtifactCarouselTestOpMode extends OpMode {
    private ArtifactCarousel carousel;
    boolean intakeActive = false;

    @Override
    public void init() {
//creates a new hardware in the hardware map called carousel
        carousel = new ArtifactCarousel(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
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
    }
}