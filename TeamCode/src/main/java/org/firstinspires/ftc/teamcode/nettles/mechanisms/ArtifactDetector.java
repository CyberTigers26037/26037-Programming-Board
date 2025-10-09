package org.firstinspires.ftc.teamcode.nettles.mechanisms;

import android.graphics.Color;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

public class ArtifactDetector {
    private final NormalizedColorSensor colorSensor;

    public ArtifactDetector (HardwareMap hwMap) {
        colorSensor = hwMap.get (NormalizedColorSensor.class, "sensor_color_distance");
    }
    public String detectArtifactColor () {
        final float [] hsvValues = new float [3];
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        float hue = hsvValues [0];

        if ((hue >= 140) && (hue <= 180)){
         return "Green";

        }
        if ((hue >= 220) && (hue <= 260)){
            return "Purple";
        }
        return Float.toString(hue);
    }
}
