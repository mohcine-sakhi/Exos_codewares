import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] tab = Solution.twoSum(new int[]{1,2,3}, 4);


        System.out.println(Arrays.binarySearch(new int[]{1,2,3}, 1108));
        System.out.println(0 % 5);


    }
}







/*
import java.util.*;

class A {

    static boolean exists(int[] ints, int k) {
        int min = 0;
        int max = ints.length - 1;

        while(min <= max){
            int index = (min + max) / 2;
            int val = ints[index];

            if(val == k){
                return true;
            }else{
                if(val < k){
                    min = index + 1;
                }else{
                    max = index - 1;
                }
            }
        }
        return false;
    }
}

class Node {

    // keep these​​​​​​‌​​​‌‌​​‌​‌​​​​​‌​‌​‌​‌​​ fields
    Node left, right;
    int value;

    public boolean recherche(int value) {
        if (value == getValeur())
            return true;
        if ((value < getValeur()) && (getSousArbreGauche() != null))
            return (getSousArbreGauche().recherche(value));
        if ((value > getValeur()) && (getSousArbreDroit() != null))
            return (getSousArbreDroit().recherche(value));
        return false;
    }

   Node find(int val){
        if(){
            return this;
        }else if( val < value){
            return this.left.find(val);
        }else{
            return this.right.find(val);
        }

        Node node = this;
        while (this != null && value != val){
            if(val < value){
                node = node.left;
            }else {
                node = node.right;
            }
        }

        return node;
    }


}
 */
