public class Subarray {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        printsub(arr);

    }  
    
    public static void printsub(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length;j++){
                int end = j;
                System.err.println();
                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
            }
        }
    }
}
