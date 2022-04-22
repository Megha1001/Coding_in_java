import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
       int [] arrayToSort = {7,6,5,4,3,2,1};
       selectionSort(arrayToSort);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    static void selectionSort(int [] arrayToSort){
        int sizeOfInputArr = arrayToSort.length;
        
        for (int i = 0; i < sizeOfInputArr -1 ; i++){
            int minElemIdx = i;
            for(int j = i+1; j < sizeOfInputArr ; j++){
                System.out.println("Inside inner for loop");
                // Change > to < for descending order
                if(arrayToSort[minElemIdx] > arrayToSort[j]){
                    minElemIdx = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minElemIdx];
            arrayToSort[minElemIdx] = temp;
        }
    }
}
