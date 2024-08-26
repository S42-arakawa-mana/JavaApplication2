package com.example;

public class Sample {
    public static String getColor(int rgb) {
        switch (rgb) {
        case 1:
            return "赤";
        case 2:
            return "緑";
        case 3:
            return "青";
        }
        throw new IllegalArgumentException();
    }
}