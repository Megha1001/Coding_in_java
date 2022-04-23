import java.util.*;
class QuickSort{
    public static void main(String[] args) {
        int[] inputArr = {-4,-2,4,7,-8,0};
		    int size = inputArr.length;
        System.out.println("Sorted Array in Ascending Order: ");
        quickSort(inputArr, 0, size -1);
		    System.out.println(Arrays.toString(inputArr));
    }
    
     public static void quickSort(int [] inputArr, int low, int high){
        if(low < high){
            int pivot = partition(inputArr, low, high);
            quickSort(inputArr, low, pivot -1);
            quickSort(inputArr, pivot + 1, high);
        }
    }
    
    public static int partition(int[] inputArr, int low, int high){
        int i = low - 1;
		    int pivot = inputArr[high];
        for (int j = low; j < high ; j++){
            if(inputArr[j] <= pivot){
                i++;
                int temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
            }
        }
        i++;
        int temp = inputArr[i];
        inputArr[i] = inputArr[high];
        inputArr[high] = temp;
        return i;
    }
}
