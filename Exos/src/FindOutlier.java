import java.util.Arrays;

public class FindOutlier{

    public static int find(int[] integers){
        int index = 0;
        if(arrayParity(integers)){
            while(integers[index] % 2 == 0){
                ++ index;
            }
        }else{
            while(integers[index] % 2 != 0){
                ++ index;
            }
        }
        return integers[index];
    }

    public static boolean arrayParity(int[] integers){
        int sum = 0;

         sum = Arrays.stream(integers).limit(3).map(Math::abs).map(val -> val % 2).sum() ;

        return (sum <= 1);
    }
}