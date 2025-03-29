public class Maxsum {

    public static void main(String args[]){

        int arr[] ={1,-2,6,-1,3};
        System.out.println(printsum(arr));
        
    }
    public static int printsum(int arr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i;j<arr.length; j++){
                int end = j;
                currentsum = 0;
                for(int k = start ; k<=end; k++){
                    currentsum += arr[k];
                }
                System.out.println(currentsum);
                if(currentsum>maxsum){
                    maxsum = currentsum;
                }
            }

            
        }
        return maxsum;

    }   
}
