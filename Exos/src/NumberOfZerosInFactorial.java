public class NumberOfZerosInFactorial {

    /*
    * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
    N! = 1 * 2 * 3 * ... * N
    Be careful 1000! has 2568 digits...
    * */
    public static int zeros(int n) {
        int zeros = n / 5;
        int nb;
        for(int i = 25; i <= n; i += 25){
                nb = i / 5;
                while(nb % 5  == 0){
                    ++zeros;
                    nb = nb / 5;
                }
        }
        return zeros;
    }
}
