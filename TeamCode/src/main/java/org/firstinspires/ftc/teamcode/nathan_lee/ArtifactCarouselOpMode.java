package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name="Nathan ArtifactCarouselTes")
public class ArtifactCarouselOpMode extends OpMode {
        private ArtifactCarousel carousel;

    @Override
    public void init(){

        carousel = new ArtifactCarousel(hardwareMap);
        }

        @Override
        public void loop(){
            if(gamepad1.x){
                carousel.moveCarouselToIntakePosition(1);
            }
            if(gamepad1.b){
                carousel.moveCarouselToIntakePosition(2);
            }
            if(gamepad1.y){
                carousel.moveCarouselToIntakePosition(3) ;
            }
        }

}