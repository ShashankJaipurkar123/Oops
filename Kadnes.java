import java.util.*;
public class Kadnes {
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,5,1,-3};
        System.err.println(maxsum(arr));

    }

    public static int maxsum(int arr[]){
        int currsum = 0;
        int maxsum1 = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            currsum += arr[i];

            if(currsum<0){
                currsum = 0;
            }
            maxsum1 = Math.max(maxsum1, currsum);
        }
        return maxsum1;
    }
}
