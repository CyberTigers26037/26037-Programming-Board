package org.firstinspires.ftc.teamcode.jeremiah;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactCarousel {
    private final Servo servo;

    public ArtifactCarousel(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "carouselServo");
    }

    public void moveCarouselToIntakePosition(int position) {
        switch (position) {
            case 1:
                setServoToAngle(servo, -90);
                break;
            case 2:
                setServoToAngle(servo, -60);
                break;
            case 3:
                setServoToAngle(servo, -30);
                break;
        }
    }

    private static final double SERVO_DEGREES = 180;

    private void setServoToAngle(Servo servo, double degrees) {
        servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));
    }


    public void moveCarouselToFirePosition(int position) {
        switch (position) {
            case 1:
                setServoToAngle(servo, 0);
                break;
            case 2:
                setServoToAngle(servo, 45);
                break;
            case 3:
                setServoToAngle(servo, 90);
                break;


        }

    }

}
