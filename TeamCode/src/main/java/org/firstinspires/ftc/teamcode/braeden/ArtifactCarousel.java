package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactCarousel {
    private final Servo servo;

    public ArtifactCarousel (HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "CarouselServo");
    }

    public void moveCarouselToIntakePosition(int position) {
        switch (position) {
            case 1:
                setServoToAngle(-90);
                break;
            case 2:
                setServoToAngle(-60);
                break;
            case 3:
                setServoToAngle(-30);
                break;
        }
    }

    public void moveCarouselToFirePosition(int position) {
        switch (position) {
            case 1:
                setServoToAngle(0);
                break;
            case 2:
                setServoToAngle(45);
                break;
            case 3:
                setServoToAngle(90);
                break;
        }
    }

    private static final double SERVO_DEGREES = 180;
    private void setServoToAngle(double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));
    }
}
