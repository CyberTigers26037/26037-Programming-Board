package org.firstinspires.ftc.teamcode.nettles.mechanisms;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactLauncher {
    private final DcMotorEx flywheelMotor;
    private final Servo flipperServo;
    private double flywheelPower = 0.5;
    public double getFlywheelPower() {
        return flywheelPower;
    }
    public void adjustFlywheelPower (double amount) {
            flywheelPower += amount;
    }
    public ArtifactLauncher(HardwareMap hwMap) {
        flywheelMotor = hwMap.get (DcMotorEx.class, "flywheelMotor");
        flipperServo = hwMap.get(Servo.class, "flipperServo");
        //parkFlipper();
    }
public void startFlywheelMotor() {
        flywheelMotor.setPower(flywheelPower);

}
public void stopFlywheelMotor() {
        flywheelMotor.setPower(0);
}
public void raiseFlipper() {
        setFlipperServoToAngle(flipperServo,45);
}
public void parkFlipper(){
        setFlipperServoToAngle(flipperServo, 0);
}
private static final double SERVO_DEGREES = 270;
private void setFlipperServoToAngle (Servo servo, double degrees) {
    servo.setPosition(Range.scale(degrees, -SERVO_DEGREES / 2, SERVO_DEGREES / 2, 0, 1));
}

}
