package org.firstinspires.ftc.teamcode.jeremiah;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="jeremiah ArtifactCarouseTestOpMode")
public class ACE extends OpMode {
    private ArtifactCarousel carousel;

    @Override
    public void init() {

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