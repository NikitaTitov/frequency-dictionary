package com.emap.learning;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

public final class FrequencyDictionary {
    private FrequencyDictionary() {
    }

    public static HashMap<String, Integer> searchForRepeat(String incomeString) {
        List<String> list = Arrays.asList(ParseString.parse(incomeString));
        HashMap<String, Integer> result = list.stream()
                .collect(groupingBy(identity(),summingInt(e -> 1)));
        return result;
    }
}
