package org.firstinspires.ftc.teamcode.nettles.mechanisms;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import
com.qualcomm.robotcore.util.Range;

public class ArtifactLauncher {
    private final DcMotorEx flywheelMotor;
    private final Servo flipperServo;

    public ArtifactLauncher(HardwareMap hwMap) {
        flywheelMotor = hwMap.get (DcMotorEx.class, "flywheelMotor");
        flipperServo = hwMap.get(Servo.class, "flipperServo");
        parkFlipper();
    }
}
