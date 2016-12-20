package com.emap.learning;

import java.util.regex.Pattern;

public final class ParseString {
    private static String regexp = "[^a-zA-Z]+";
    private static Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
    private ParseString(){

    }
    public static String[] parse(String incomeString) {
        String[] result = pattern.split(incomeString.toLowerCase());
        return result;
    }
}
