import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Util {

    private static final String PROP_PATH = "src/main/resources/properties.json";

    private static String[] strToWords (String s) {
        return s.split("\\W+");
    }

    public static List<String> getDiff (String s1, String s2) {
        List<String> dif = new ArrayList<>();

        for(String word : strToWords(s1)) {
            if(!Arrays.asList(strToWords(s2)).contains(word)) {
                dif.add(word);
            }
        }
        return dif;
    }

    private static JSONObject getJsonObj (String path) {
        JSONObject jsonObj = new JSONObject();

        try {
            jsonObj = (JSONObject) new JSONParser().parse(new FileReader(path));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return jsonObj;
    }

    public static String getProp (String key) {
       return (String) getJsonObj(PROP_PATH).get(key);
    }

    public static int wordCounter (String s1, String s2) {
        int count = 0;
        Matcher matcher = Pattern.compile(s2.toLowerCase()).matcher(s1.toLowerCase());
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int punctuationCount (String s) {
        return wordCounter(s, getProp("punctuationMarks"));
    }
}


