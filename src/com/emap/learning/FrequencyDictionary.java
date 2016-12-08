package com.emap.learning;
import java.util.HashMap;

public final class FrequencyDictionary {
    private FrequencyDictionary() {
    }

    public static HashMap<String, Integer> searchForRepeat(String[] incomeString) {
        HashMap<String, Integer> result = new HashMap<>();
        int counter = 0;
        String[] stringForMatcher = incomeString;

        for (int i = 0; i < incomeString.length; i++) {
            for (int j = 0; j < incomeString.length; j++){
                if (incomeString[i].matches(stringForMatcher[j])){
                    counter++;
                }

            }
            result.put(incomeString[i],counter);
            counter = 0;
        }
        return result;
    }
}
