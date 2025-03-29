public class Linears {
    public static void main(String args[]){

        int arr[] = {5,6,7,8,9,22,44};
        int key = 8;
        System.out.println(linear(arr, key));


    
        



    }

    public static int linear(int arr[], int key){


        for(int  i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
           
        }
        return -1;
    }
}
