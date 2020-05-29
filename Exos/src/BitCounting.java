import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BitCounting {

   // Write a function that takes an integer as input, and returns the number of bits that are
    // equal to one in the binary representation of that number. You can guarantee that input is non-negative.
    //Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


    public static int countBits(int n){
        String bits = binary(n);
        int sum = 0;
        for(int i = 0; i < bits.length(); ++i){
            if(bits.charAt(i) == '1'){
                ++sum;
            }
        }

        return sum;
        //return Integer.bitCount(n);
        //return Integer.toBinaryString(n).replace("0","").length();
        //return (int) Integer.toBinaryString(n).chars().filter(val -> val == '1').count();
    }

    public static String binary(int n){
        String binary = "";

        int nb;
        do{
            nb = n;
            binary += (n % 2);
            n /= 2;
        }while(nb / 2 != 0);

        return new StringBuilder(binary).reverse().toString();
    }
}