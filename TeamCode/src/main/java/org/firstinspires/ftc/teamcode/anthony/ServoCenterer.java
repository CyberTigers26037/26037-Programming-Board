package org.firstinspires.ftc.teamcode.anthony;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoControllerEx;
import com.qualcomm.robotcore.hardware.ServoImplEx;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.ServoConfigurationType;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@TeleOp(name="Anthony Servo Centerer")
public class ServoCenterer extends OpMode {
    List<Servo> servos;

    @Override
    public void init() {
        // Obtain the servo controller from our hardware map. There should always be 1.
        List<ServoControllerEx> servoControllers = hardwareMap.getAll(ServoControllerEx.class);
        if (servoControllers.isEmpty()) {
            telemetry.addLine("Unable to obtain servo controller!");
            telemetry.update();
            return;
        }

        // Ignore robot configuration, assume there are 6 servos all connected to the ports, and
        // create 6 servo instances we can control.
        servos = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            servos.add(new ServoImplEx(servoControllers.get(0), i, ServoConfigurationType.getStandardServoType()));
        }

        telemetry.addLine("Ready to center ALL 6 servo ports?");
        telemetry.addLine("Press run to execute");
        telemetry.update();
    }

    @Override
    public void loop() {
        if (servos == null) return;

        // Set all servos to 0.5 (center)
        for (Servo servo:servos) {
            servo.setPosition(0.5);
        }

        telemetry.addLine("All 6 servo ports centered");
        telemetry.update();
    }
}
