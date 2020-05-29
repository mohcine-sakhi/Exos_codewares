public class PhoneExample {
    //Write a function that accepts an array of 10 integers (between 0 and 9),
    // that returns a string of those numbers in the form of a phone number.
    public static String createPhoneNumber(int[] numbers) {
        String chaine  = "";
        for(int i = 0; i < numbers.length; ++i){
            switch (i){
                case 0 : chaine += "("+ String.valueOf(numbers[i]); break;
                case 2 : chaine += String.valueOf(numbers[i])+") "; break;
                case 6 : chaine += "-"+ String.valueOf(numbers[i]); break;
                default: chaine += String.valueOf(numbers[i]);
            }
        }

        return chaine;
    }
}
