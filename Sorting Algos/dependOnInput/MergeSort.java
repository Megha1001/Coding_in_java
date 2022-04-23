import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
       int [] arrayToSort = {-7,2,5,1,0,-6};
       MergeSort mergeSortObj = new MergeSort();
       mergeSortObj.mergeSort(arrayToSort,0,arrayToSort.length-1);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    void mergeSort(int [] arrayToSort, int l, int r){
       if(l < r){
        int m = (l+r)/2;
        mergeSort(arrayToSort, l , m);
        mergeSort(arrayToSort, m + 1 , r);
        merge(arrayToSort, l, m , r);
       }
    }
    
    void merge(int [] arrayToSort, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - (q+1) + 1;
        
        int [] L = new int[n1];
        int [] M = new int[n2];
        
        for(int i = 0 ; i < n1 ; i++) L[i] = arrayToSort[p + i];
        for(int i = 0 ; i < n2 ; i++) M[i] = arrayToSort[q + 1 + i];
        
        int i = 0; int j = 0; int k = p;
        
        while( i < n1 && j < n2){
            /* Order
            L[i] < M[i]; --> ascending
            L[i] > M[i]; --> descending*/
            if(L[i] < M[j]){
                arrayToSort[k] = L[i];
                i++;
                k++;
            }else{
                arrayToSort[k] = M[j];
                j++;
                k++;
            }
        }
        
        while(i < n1){
            arrayToSort[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n2){
            arrayToSort[k] = M[j];
            j++;
            k++;
        }
    }
}
