package org.firstinspires.ftc.teamcode.braeden;

import android.graphics.Color;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

public class ArtifactDetector {
    private final NormalizedColorSensor colorSensor;
    private ArtifactDetector detector;

    public ArtifactDetector(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "sensor_color_distance");

    }

    public String detectArtifactColor() {
        final float[] hsvValues = new float[3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        float hue = hsvValues[0];
        if ((hue >= 225) && (hue <= 240)) {
            return "Purple";
        }
        if ((hue >= 145) && (hue <= 180)) {
            return "Green";
        } else {
            return "None";
        }

    }
}

