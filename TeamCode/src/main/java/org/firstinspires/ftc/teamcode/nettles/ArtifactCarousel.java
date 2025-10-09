package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactCarousel {
    private final Servo servo;

    public ArtifactCarousel (HardwareMap hwMap) {
        servo = hwMap.get (Servo.class, "carouselServo");
    }
    public void moveCarouselToFirePosition (int position){
        if (position == 1) {
            setServoToAngle(servo, 0);
        }
        if (position == 2){
            setServoToAngle(servo,45);
        }
        if (position ==3){
            setServoToAngle(servo, 90);
        }
    }
    public void moveCarouselToIntakePosition(int position) {
        if (position == 1)
        {
            setServoToAngle(servo, -90);}
        if (position ==2)
        {
            setServoToAngle(servo, -60);}
        if (position == 3) {
            setServoToAngle (servo, -30);
        }
    }
    private static final double SERVO_DEGREES = 180;
    private void setServoToAngle (Servo servo, double degrees){
            servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }
}
