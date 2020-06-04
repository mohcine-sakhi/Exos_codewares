import java.util.Arrays;
import java.util.stream.Collectors;

/*
    Description:

    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    Leave punctuation marks untouched.
    Examples

    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
*/

public class PigLatin {
    public static String pigIt(String str) {
       return Arrays.stream(str.split(" "))
                .map(word -> pig(word)).collect(Collectors.joining(" "));
    }

    public static String pig(String word){
        if(! Character.isLetter(word.charAt(0))){
            return word;
        }

        return word.substring(1)
                .concat(String.valueOf(word.charAt(0)))
                .concat("ay");
    }
}