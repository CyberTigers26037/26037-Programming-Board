package org.firstinspires.ftc.teamcode.subassembly;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Claw {

    private Elbow elbow;
    private Pincher pincher;
    private Wrist wrist;

    public Claw(HardwareMap hwMap) {
        elbow = new Elbow(hwMap);
        wrist = new Wrist(hwMap);
        pincher = new Pincher(hwMap);

    }

    public void straightSampleGrab(){
        elbow.down();
        wrist.straight();
        pincher.open();

    }

    public void dropSample() {
        pincher.open();
    }

    public void pickupSample() {
        pincher.close();
    }

}
