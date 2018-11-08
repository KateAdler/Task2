import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> res = Util.getDiff(Util.getProp("str1"), Util.getProp("str2"));
        System.out.println(res);  // 1 task

        System.out.println(Util.wordCounter(Util.getProp("str3"), Util.getProp("word")));  //2.1 task
        System.out.println(Util.punctuationCount(Util.getProp("str4")));  //2.2 task

        System.out.println(System.getProperty("myProperty")); //3 task

    }
}
