package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//names TelopOp
@TeleOp(name = "Nettles ClassMemberOpMode")
public class ClassMemberOpMode extends OpMode{
    //names boolean(True/False) variable initDone
    boolean initDone;
    @Override
    public void init() {
        // sends message to driver station which will read false
        telemetry.addData("init Done" , initDone);
        // Boolean value initDone changed to true
        initDone = true;
        }

    @Override
    public void loop() {
        //runs a continuous loop that continually requests initDone value which was set to true above. telelemetry add data sends to driver hub.
        telemetry.addData("init Done" , initDone);

    }
}
