package com.emap.learning;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

public final class FrequencyDictionary {
    private FrequencyDictionary() {
    }

    public static Map<String, Integer> searchForRepeat(String incomeString) {
        List<String> list = Arrays.asList(ParseString.parse(incomeString));
        Map<String, Integer> result = list.stream()
                .collect(groupingBy(identity(),summingInt((String str) -> 1)));
        return result;
    }
}
