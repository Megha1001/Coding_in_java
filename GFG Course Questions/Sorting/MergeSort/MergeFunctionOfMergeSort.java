import java.util.Arrays;
public class MergeFunctionOfMergeSort{

    public static void main(String []args){
        int [] a = {10,20,40,20,30};
        mergeFuncofMergeSort(a, 0,2,4);
      
    }
    
    static void mergeFuncofMergeSort(int a [], int low, int mid, int high){
        //setting auxiliary arrays
        int m = mid-low+1;
        int n = high-mid;
        
        int [] left = new int[m];
        int [] right = new int[n];
        
        for(int i = 0; i < m ; i++){
            left[i] = a[low+i];
        }
        
        for(int i = 0; i < n; i++){
            right[i] = a[mid+1+i];
        }
        
        //standard merge function
        int i =0, j = 0, k = 0;
        
        while(i < m && j < n){
            if(left[i] <= right[j]){
                a[k++] = left[i++];
            }else{
                a[k++] = right[j++];
            }
        }
        
        while(i < m){
            a[k++] = left[i++];
        }
        
        while(j < n){
            a[k++] = right[j++];
        }
        
        System.out.println(Arrays.toString(a));
        
    }
}
