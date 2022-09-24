import java.util.Arrays;
public class MergeSort{

    public static void main(String []args){
        int [] a = {90,39,20,78,34,45,0,1,7,6,4,7};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    
    static void mergeSort(int [] a, int low, int high){
        
        if(high > low){
            int mid = low + (high - low)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
        
    }
    
    static void merge(int[] a, int low, int mid, int high){
        
        //setting arbitary array
        int l = mid-low+1; // from low to mid
        int m = high-mid; // from mid+1 to high

        int[] left = new int[l];
        int[] right = new int[m];
        
        for(int i = 0; i < l; i++){
            left[i] = a[low+i];
        }
        
        for(int i = 0; i < m; i++){
            right[i] = a[mid+i+1];
        }
        
        //for left array
        int idx1 = 0;
        
        //for right array
        int idx2 = 0;
        
        //for original array
        int idx3 = low;
        
        while(idx1 < l && idx2 < m){
            if(left[idx1] <= right[idx2]){ // '=' is for stability
                a[idx3++] = left[idx1++];
            }else{
                a[idx3++] = right[idx2++];
            }
        }
        
        while(idx1 < l){
             a[idx3++] = left[idx1++];
        }
        
        while(idx2 < m){
             a[idx3++] = right[idx2++];
        }
        
        
    }
}
