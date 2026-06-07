package Array;
import java.util.*;

class FindMinMax{
    public static void main(String[] args){
        int[] arr = {10 , 20 , 30 , 40 , 50 , 60};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max Value: "+max);
        System.out.println("Min Value: "+min);

    }
}