package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class ArtifactSystem {
    private final ArtifactCarousel carousel;
    private final ArtifactDetector detector;
    private final ArtifactLauncher launcher;
    private final ArtifactIntake intake;

    private final Servo servo;

    public ArtifactSystem(HardwareMap hwMap){
        carousel = new ArtifactCarousel(hwMap);
        detector = new ArtifactDetector(hwMap);
        launcher = new ArtifactLauncher(hwMap);
        intake = new ArtifactIntake(hwMap);

        servo = hwMap.get(Servo.class, "carouselServo");
    }

    public void startIntake(int position) {
        intake.start();
        carousel.moveCarouselToIntakePosition(1);
    }

    public void stopIntake(){
        intake.stop();
    }

    public void toggleIntake(){
        intake.isRunning();
    }

    public void startLauncher(){
        launcher.startFlywheelMotor();
        carousel.moveCarouselToFirePosition(1);
    }

    public void raiseFlipper() {
        launcher.raiseFlipper();
    }

    public void parkFlipper(){
        launcher.parkFlipper();
    }

    public void stopLauncher(){
        launcher.stopFlywheelMotor();
    }

    public void adjustLauncherPower(double amount) {
        launcher.adjustFlywheelPower(amount);
    }

    public void getLauncherPower(){
        launcher.getFlywheelPower();
    }

    public void moveCarouselToPosition(int position) {
        if(intake.isRunning()){
            carousel.moveCarouselToIntakePosition(position);
        }
        else {
            carousel.moveCarouselToFirePosition(1);
            intake.stop();
        }

    }

}
