import java.util.Arrays;

class BubbleSortInAsc {
    public static void main(String[] args) {
       int [] arrayToSort = {7,0,-9,-4,7,3,2,8};
       bubbleSort(arrayToSort);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    static void bubbleSort(int [] arrayToSort){
        int sizeOfInputArr = arrayToSort.length;
        
        for (int i = 0; i < sizeOfInputArr -1 ; i++){
            for(int j = 0; j < sizeOfInputArr - i -1 ; j ++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] =arrayToSort[j+1];
                    arrayToSort[j+1]= temp;
                }
            }
        }
    }
}
