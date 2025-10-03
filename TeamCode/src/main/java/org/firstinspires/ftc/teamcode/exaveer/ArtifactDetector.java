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
        final float[] hsvValues = new float[3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        float hue = hsvValues[0];

        if (hue >= 150 && hue <= 180) {
            return "Green";
        }
        else if (hue >= 200 && hue <= 250) {
            return "Purple";
        }
        return null;
    }
}
//green 150-180
//purple 200-250