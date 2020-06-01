public class Order {
    /*
    Description:
    Your task is to sort a given string. Each word in the string will contain a single number.
    This number is the position the word should have in the result.
    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
    If the input string is empty, return an empty string.
    The words in the input String will only contain valid consecutive numbers.
    Examples

    "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
    ""  -->  ""
     */
    public static String order(String words) {
        if(words.length() == 0){
            return "";
        }

        String[] wordsArray = words.split(" ");
        String[] wordClassified = new String[wordsArray.length];

        for(int i = 0; i < wordsArray.length ; ++i){
            int index = findIndex(String.valueOf(i + 1), wordsArray);
            wordClassified[i] = wordsArray[index];
        }
        return String.join(" ", wordClassified);
    }

    public static int findIndex(String word, String[] words ){
        int index = words.length;
        boolean found = false;
        for(int i = 0; i < words.length && ! found; ++i){
            if(words[i].contains(word)){
                index = i;
                found = true;
            }
        }
        return index;
    }
}