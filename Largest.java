public class Largest {
    public static void main(String args[]){

        int arr[] = {5,6,7,8,9,22,34,56};
        System.out.println(largest(arr));

    }

    public static int largest(int arr[]){
        int a  = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]> a){
                a = arr[i];
            }
        }
        return a;
    }
}
