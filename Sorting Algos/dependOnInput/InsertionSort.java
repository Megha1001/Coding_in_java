import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
       int [] arrayToSort = {-7,2,5,1,0,-6};
       insertionSort(arrayToSort);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    static void insertionSort(int [] arrayToSort){
        int sizeOfInputArr = arrayToSort.length;
        
        for(int i = 1; i < sizeOfInputArr ; i++){
            int key = arrayToSort[i];
            int j = i-1;
            while(j >=0 && key < arrayToSort[j]){
                arrayToSort[j + 1] = arrayToSort[j];
                --j;
            }
            arrayToSort[j + 1] = key;
        }
    }
}
