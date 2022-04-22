import java.util.Arrays;

class BubbleSortInAsc {
    public static void main(String[] args) {
       int [] arrayToSort = {1,2,3,4,5,6,7};
       bubbleSort(arrayToSort);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    static void bubbleSort(int [] arrayToSort){
        int sizeOfInputArr = arrayToSort.length;
        
        for (int i = 0; i < sizeOfInputArr -1 ; i++){
            boolean swapped = false;
            for(int j = 0; j < sizeOfInputArr - i -1 ; j ++){
                System.out.println("Inside inner for loop");
                if(arrayToSort[j] > arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] =arrayToSort[j+1];
                    arrayToSort[j+1]= temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
}
