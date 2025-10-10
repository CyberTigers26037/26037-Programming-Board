package org.firstinspires.ftc.teamcode.nathan_lee;


import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;


public class ArtifactSystem {
    private final ArtifactCarousel carousel;
    private final ArtifactColorSensor detector;
    private final ArtifactLauncher launcher;
    private final ArtifactIntake intake;
    private double flywheelPower = 0.5;


    public ArtifactSystem(HardwareMap hwMap) {
        carousel = new ArtifactCarousel(hwMap);
        detector = new ArtifactColorSensor(hwMap);
        launcher = new ArtifactLauncher(hwMap);
        intake = new ArtifactIntake(hwMap);
    }


    public void startIntake() {
        carousel.moveCarouselToIntakePosition(1);
        intake.start();
        //TODO: write code to start the intake and move the carousel to intake position 1
    }


    public void stopIntake() {
        intake.stop();
        //TODO: write code to stop the intake
    }


    public void toggleIntake() {
        if(!intake.isRunning()){
            intake.start();
        }
        else{
            intake.stop();
        }
        //TODO: write code to stop the intake if it is running and start the intake if
        //it is  not running
     }


    public void startLauncher() {
            carousel.moveCarouselToFirePosition(1);
            launcher.startFlywheelMotor();
        // TODO: write code to start the flywheel motor and move the carousel to
        // fire position 1
    }

    public void raiseFlipper() {
        launcher.raiseFlipper();
        // TODO: write code to raise the flipper
    }


    public void parkFlipper() {
        launcher.parkFlipper();
        // TODO: write code to park the flipper
    }


    public void stopLauncher() {
        launcher.stopFlywheelMotor();
        // TODO: write code to stop the launcher flywheel motor
    }


    public void adjustLauncherPower(double amount) {
        flywheelPower += amount;
        flywheelPower = Range.clip(flywheelPower,0.1,1.0);

        // TODO: write code to adjust the launcher flywheel power
    }


    public double getLauncherPower() {
        return flywheelPower;
        // TODO: write code to return the launcher flywheel power
    }


    public void moveCarouselToPosition(int position) {
        if (intake.isRunning()){
            carousel.moveCarouselToIntakePosition(position);
        }
        else{
            carousel.moveCarouselToFirePosition(position);
        }
        // TODO: write code to move the carousel to an intake position if the intake
        // is running and move the carousel to a fire position if the intake is not running
    }


    public boolean isIntakeRunning() {
        return intake.isRunning();
        // TODO: write code to return whether the intake is running
    }


    public boolean isLauncherRunning() {
        return launcher.isRunning();

        // TODO: write code to return whether the launcher is running
        // NOTE: to complete this method, you will need to add a method on the
        // ArtifactLauncher class called isRunning(), similar to the one in our
        // ArtifactIntake class.
    }
}

