import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String chaine = "Just kidding there is still one more";

        System.out.println(spinWords(chaine));
        System.out.println(Integer.MAX_VALUE);


        }

    static String spinWords(String sentence) {
            //TODO: Code stuff here
            String[] sentences  = sentence.split(" {1,}");

        return Arrays.stream(sentences).map(word -> word.length() >= 5 ? reverse(word) : word).collect(Collectors.joining(" "));
            //return String.join(" ", sentences) ;
    }

    static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
