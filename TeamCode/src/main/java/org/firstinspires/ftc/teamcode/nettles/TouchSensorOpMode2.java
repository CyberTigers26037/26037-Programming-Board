package org.firstinspires.ftc.teamcode.nettles;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.nettles.mechanisms.ProgrammingBoard2;
//suppresses the warning of a line being unused which often happens
@SuppressWarnings("unused")
//Declares this class to be TeleOp on the Control Hub and Names it.
@TeleOp( name = "Nettles TouchSensorOpMode2")
//Declares the security of the class and extends the OpMode from FTC
// which requires the 2 methods.
public class TouchSensorOpMode2 extends OpMode {
    //refers to ProgrammingBoard2.java
    ProgrammingBoard2 board = new ProgrammingBoard2();
//Notes that this is the first method required
    @Override
    //refers the init to the init on ProgrammingBoard2
    public void init() {
        board.init(hardwareMap);
    }
//Notes that this is the second required method.
    @Override
    public void loop() {
        //Declare and assigns variable touchSensorState to the boolean board.isTouchSensorReleased
        //order is true false
        String touchSensorState = board.isTouchSensorReleased() ? "Not Pressed" : "Pressed";

        telemetry.addData("Touch released", board.isTouchSensorReleased());
        telemetry.addData("Touch pressed", board.isTouchSensorPressed());
        telemetry.addData(" Touch Sensor State" , touchSensorState);

    }
}

