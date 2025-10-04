package org.firstinspires.ftc.teamcode.bryceson;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.bryceson.ArtifactCarousel;

@SuppressWarnings("unused")
@TeleOp(name = "Bryceson ArtifactCarouselTestOpMode")
public class ArtifactCarouselTestOpMode extends OpMode {
    private ArtifactCarousel carousel;

    @Override
    public void init() {
        carousel = new ArtifactCarousel(hardwareMap);
    }

    @Override
    public void loop() {
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
