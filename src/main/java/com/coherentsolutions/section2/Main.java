package com.coherentsolutions.section2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Usage example with Collections.max()
        List<Color> colors = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE);

        Color minColor = Collections.min(colors);
        System.out.println("Min Color: " + minColor);

        Color maxColor = Collections.max(colors);
        System.out.println("Max Color: " + maxColor);
    }
}
