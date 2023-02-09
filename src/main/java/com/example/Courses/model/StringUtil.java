package com.example.Courses.model;

public class StringUtil {

    public static String capitalizeFirstLetter(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static String format(String text) {
        String output = text;
        output = output.trim();
        output = capitalizeFirstLetter(output);
        return output;
    }
}
