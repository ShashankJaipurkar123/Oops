import java.util.*;

public class Pairs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i = 0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printpair(arr);



    }

    public static void printpair(int arr[]){

        for(int i = 0; i<arr.length; i++){
            System.out.println();
            for(int j = i; j<arr.length;j++){
                System.out.print("("+ arr[i]+ ","+ arr[j]+")");
            }
        }
    }
    
}
