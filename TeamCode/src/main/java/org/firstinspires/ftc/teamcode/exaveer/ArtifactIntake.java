package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArtifactIntake {
    private final DcMotorEx intakeMotor;
    private boolean isRunning;

    public ArtifactIntake(HardwareMap hwMap){
        intakeMotor = hwMap.get(DcMotorEx.class, "intakeMotor");
    }

    public void start() {
        intakeMotor.setPower(-0.5);
        isRunning = true;
    }

    public void stop(){
        intakeMotor.setPower(0.0);
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
