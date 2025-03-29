import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Array Before rev");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Array after rev");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]= arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
}
