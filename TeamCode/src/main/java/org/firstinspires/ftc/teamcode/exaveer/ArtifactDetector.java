package org.firstinspires.ftc.teamcode.exaveer;

import android.graphics.Color;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

public class ArtifactDetector {
    private final NormalizedColorSensor colorSensor;

    public ArtifactDetector(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "sensor_color_distance");
    }

    public String detectArtifactColor() {
        final float[] havValues = new float[3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), havValues);
        float hue = havValues[0];
        return Float.toString(hue);
    }
}
