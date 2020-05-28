import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public static  String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] sentences  = sentence.split(" {1,}");

        return Arrays.stream(sentences)
                .map(word -> word.length() >= 5 ? reverse(word) : word)
                .collect(Collectors.joining(" "));

    }

    public static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
