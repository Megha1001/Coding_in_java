import java.util.Arrays;

class BubbleSortWRTOrders {
    public static void main(String[] args) {
       int [] arrayToSort = {7,0,-9,-4,7,3,2,8};
       String order = "desc";
       bubbleSort(arrayToSort,order);
       System.out.println(Arrays.toString(arrayToSort));
    }
    
    static void bubbleSort(int [] arrayToSort,String order){
        int sizeOfInputArr = arrayToSort.length;
        for (int i = 0; i < sizeOfInputArr -1 ; i++){
            for(int j = 0; j < sizeOfInputArr - i -1 ; j ++){
                if(order.equalsIgnoreCase("asc") && arrayToSort[j] > arrayToSort[j+1]){
                    interchangeJ(arrayToSort,j);
                }else if(order.equalsIgnoreCase("desc") && arrayToSort[j] > arrayToSort[j+1]){
                    interchangeJ(arrayToSort,j);
                }
            }
        }
    }
    
    static void interchangeJ(int [] arrayToSort,int position){
        int temp = arrayToSort[position];
        arrayToSort[position] =arrayToSort[position+1];
        arrayToSort[position+1]= temp;
    }
}
