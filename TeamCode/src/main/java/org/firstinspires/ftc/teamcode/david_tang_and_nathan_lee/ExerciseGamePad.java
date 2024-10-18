package org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name = "David & Nathan ExerciseGamePad")
public class ExerciseGamePad extends OpMode {
@Override
    public void init() {


}
@Override
public void loop() {

    telemetry.addData("right stick x", gamepad1.right_stick_x);
    telemetry.addData("right stick y", -gamepad1.right_stick_y);
    telemetry.addData("b button", gamepad1.b);
    double difference = -gamepad1.right_stick_y - gamepad1.left_stick_y;
    telemetry.addData("Difference", difference);
    double sum = gamepad1.right_trigger + gamepad1.left_trigger;
    telemetry.addData("Sum between left and right triggers", sum);

}
}
