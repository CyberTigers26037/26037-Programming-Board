package org.firstinspires.ftc.teamcode.jacob;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name= "jacob ArtifactCarouseTestOpMode")
public class ArtifactCarsouelTestOpMode extends OpMode {
    private ArtifactCarousel carousel;

    boolean intakeActive = false;
    @Override
    public void init() {
        carousel = new ArtifactCarousel(hardwareMap);
    }
    @Override
    public void loop() {
        if (gamepad1.aWasPressed()) {
            intakeActive = !intakeActive;
        }

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
            if (gamepad1.x){
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
