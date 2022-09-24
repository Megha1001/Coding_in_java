import java.util.Arrays;
public class SelectionSortInplaceImpl{

    public static void main(String []args){
        int [] arr = {4,3,1,8,0,6};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selectionSort(int [] arr, int n){
        
       for(int i = 0; i < n - 1; i++){// last element when left no need to swap it
            int idx  = i;
            for(int j = i+1; j < n; j++){
                if(arr[idx] > arr[j]){
                    idx = j;
                }
            }
            //swap
           int temp = arr[idx];
           arr[idx]=arr[i];
           arr[i]= temp;
        }
    }
}
