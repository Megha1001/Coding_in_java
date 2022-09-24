import java.util.Arrays;
public class InsertionSort{

    public static void main(String []args){
        int [] arr = {4,3,1,8,0,6};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int [] arr, int n){
        
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j  = i-1;
            while(j >= 0 && (arr[j] > key)){ // > is maintainig stability otherwise it makes sorting unstable
                arr[j+1] = arr[j];
                --j;
            }
            
            arr[j+1] = key;
        }
        
    }
}
