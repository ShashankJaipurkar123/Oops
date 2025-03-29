public class BS1 {
    public static void main(String args[]){

        int arr[] = {2,4,5,6,7};
        int key = 5;
        System.out.println(bsearch(arr, key));

    }

    public static int bsearch(int arr[], int key){

        int start = 0;
        int end  = arr.length-1;
        while(start <= end){
            int mid = (start + arr.length-1)/2;
            if(arr[mid] == key){
                return mid;
            }
        if(mid< key){
            start = arr[mid]+1;
        } 
        else{
            end = arr[mid]-1;
        }

            }
            return -1;
        }
        
    }

