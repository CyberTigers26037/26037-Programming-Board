package org.firstinspires.ftc.teamcode.Jose;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactCarousel {
    private final Servo servo;

    public ArtifactCarousel(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "carouselServo");
    }

    public void moveCarouselToIntakePosition(int position) {
        // TODO: write code to move the carousel to the correct positions
    }

    private static final double SERVO_DEGREES = 180;

    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));
    }
}