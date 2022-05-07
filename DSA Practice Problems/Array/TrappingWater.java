/*
Approach : the idea is to traverse every array element and find the highest bras on the left and right sides.Take the smaller of two heights. the difference between
the smaleer height and height of the current elemnt is the amout of warer that can be stored in this array element.

Algorithm :
1. Traverse the array from start to end.
2. For every element, traverse the array from start to that index and find the maximum height(a) and traverse the array from the current index to end, and find the maximum
heigh (b).
3. The amoutn of water that will be stored in this column is min(a,b)- array[i], add this value to the total amount of water stored.
4. Print the toltal amound of water stored.
*/
class TrappingWater{
    static long trappingWater(int arr[], int n) { 
        
        long result = 0;
        for(int i =0 ; i < n - 1 ; i++){
            
            long left = arr[i];
            for(int j = 0 ; j < i; j++){
                left = Math.max(left, arr[j]);
            }
            long right = arr[i];
             for(int j = i+1 ; j < n; j++){
                right = Math.max(right, arr[j]);
            }
            
            result += Math.min(left,right) - arr[i];
            
        }
        return result;
    } 
}

