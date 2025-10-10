package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Nathan ArtifactCarouselTest", group = "OpMode")
public class ArtifactCarouselOpMode extends OpMode {
        private ArtifactCarousel carousel;
        boolean intakeActive = false;
        private ArtifactColorSensor detector;

    @Override
    public void init(){
        detector = new ArtifactColorSensor(hardwareMap);
        carousel = new ArtifactCarousel(hardwareMap);
        }

        @Override
        public void loop(){
            if(gamepad1.x){
                carousel.moveCarouselToIntakePosition(1);
            }
            if(gamepad1.y){
                carousel.moveCarouselToIntakePosition(2);
            }
            if(gamepad1.b){
                carousel.moveCarouselToIntakePosition(3) ;
            }
            if(gamepad1.aWasPressed()){
                intakeActive = !intakeActive;
            }
            if(gamepad1.back && gamepad1.x){
                carousel.moveCarouselToFirePosition(1);
            }
            if(gamepad1.back && gamepad1.y){
                carousel.moveCarouselToFirePosition(2);
            }
            if(gamepad1.back && gamepad1.b){
                carousel.moveCarouselToFirePosition(3);
            }

            telemetry.addData("INTAKE ACTIVE: ", intakeActive);
            telemetry.addData("CAROUSEL POSITION: ", carousel.getCurrentPosition());
            telemetry.addData("FIRING POSITION: ", carousel.getCurrentPosition());
            telemetry.addData("Artifact Color", detector.detectArtifactColor());
            telemetry.update();
        }

}