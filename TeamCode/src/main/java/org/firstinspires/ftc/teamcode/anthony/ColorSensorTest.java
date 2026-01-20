package org.firstinspires.ftc.teamcode.anthony;

import android.graphics.Color;

import com.qualcomm.hardware.broadcom.BroadcomColorSensor;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.I2cDeviceSynchSimple;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

@SuppressWarnings("unused")
@TeleOp(name="Anthony Color Sensor Test")
public class ColorSensorTest extends OpMode {
    private NormalizedColorSensor colorSensor;

    @Override
    public void init() {
        colorSensor = hardwareMap.get(NormalizedColorSensor.class, "sensor_color_distance");
    }

    @Override
    public void loop() {
        // Read color sensor
        final float[] hsvValues = new float[3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        telemetry.addData("Color Sensor Hue", "%.3f", hsvValues[0]);

        if (gamepad1.a) {
            reinitializeColorSensorIfNecessary(colorSensor);
        }

        telemetry.update();
    }

    private void reinitializeColorSensorIfNecessary(NormalizedColorSensor normalizedColorSensor) {
        if (!(normalizedColorSensor instanceof RevColorSensorV3)) return;

        RevColorSensorV3 colorSensorV3 = (RevColorSensorV3) normalizedColorSensor;
        I2cDeviceSynchSimple deviceClient = colorSensorV3.getDeviceClient();
        byte mainStatus = deviceClient.read8(BroadcomColorSensor.Register.MAIN_CTRL.bVal);
        if (mainStatus == 0) {
            // The color sensor is in the uninitialized state... reinitialize it.
            colorSensorV3.initialize();
        }
    }
}
