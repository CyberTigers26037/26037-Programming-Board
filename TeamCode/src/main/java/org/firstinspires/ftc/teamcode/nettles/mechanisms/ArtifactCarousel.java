package org.firstinspires.ftc.teamcode.nettles.mechanisms;

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
            setServoToAngle(servo, 72.7);
        }
        if (position == 2){
            setServoToAngle(servo,-27.8);
        }
        if (position ==3){
            setServoToAngle(servo, -129.9);
        }
    }
    public void moveCarouselToIntakePosition(int position) {
        if (position == 1)
        {
            setServoToAngle(servo, -77.5);}
        if (position ==2)
        {
            setServoToAngle(servo, 121.1);}
        if (position == 3) {
            setServoToAngle (servo, 19.7);
        }
    }
    private static final double SERVO_DEGREES = 270;
    private void setServoToAngle (Servo servo, double degrees){
            servo.setPosition(Range.scale(degrees, -SERVO_DEGREES/2, SERVO_DEGREES/2, 0, 1));
    }
}
