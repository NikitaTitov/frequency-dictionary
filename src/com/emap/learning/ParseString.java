package com.emap.learning;

import java.util.regex.Pattern;

public final class ParseString {
    private ParseString(){

    }
    public static String[] parse(String incomeString) {
        String regexp = "[^a-zA-Z]+";
        Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
        String[] result = pattern.split(incomeString.toLowerCase());
        return result;
    }
}
