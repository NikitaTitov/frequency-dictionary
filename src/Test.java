import static com.emap.learning.FrequencyDictionary.searchForRepeat;
import static com.emap.learning.ParseString.parse;
import static org.junit.Assert.*;


public class Test {
    String testString = "The chihuahua came to help the girl.The came ChihuAhua  to? help the girl.";
    String[] testStringArray = {"the", "chihuahua", "came", "to", "help", "the", "girl", "the", "came", "chihuahua", "to", "help", "the", "girl"};

    Integer[] arrayValuesInHashMap = {4, 2, 2, 2, 2, 2};

    @org.junit.Test
    public void testParse() throws Exception {
        assertArrayEquals(parse(testString), testStringArray);
    }

    @org.junit.Test
    public void testSearchForRepeat() throws Exception {
        assertArrayEquals(searchForRepeat(testString).values().toArray(), arrayValuesInHashMap);
    }
}