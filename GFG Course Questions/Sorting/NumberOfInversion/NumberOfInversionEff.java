/*
INVERSION : A pair (arr[i], arr[j]) forma an inversion when i < j and arr[i] > arr[j]

for Example : {2,4,1,3,5}
Inversion count : 3 [(2,1),(4,1),(4,3)]
TIME COMPLEXITY : O(NlogN)
Use : Merge Sort

Every inversion (x,y) where x > y has three possiblities
    a. both x and y lies in left half
    b. both x and y lies in right half
    c. x is in left half and y is in right half

when we are sorting the array and comparing we are actually calculating/covering many inversion that can be possible with those comparision
*/

public class NumberOfInversionEff{
    
    public static void main(String args[]) {
        int[] arr = {2,4,1,3,5};
        
        System.out.println("Number of inversion in given array are : "+countNumOfInversion(arr,0,arr.length -1));
    }
    
    
    static int countNumOfInversion(int [] arr, int l, int r){
        
        int res =0;
        if(r > l){
            int m = l + (r-l)/2;
            //count inversion in left half
            res += countNumOfInversion(arr, l, m);
            
            //count inversion in right half
            res += countNumOfInversion(arr, m+1, r);
            
            res += countAndMerge(arr, l, m, r);
        }
        
        return res;
    }
    
    
    static int countAndMerge(int []arr, int l, int m , int r){
        int res = 0;
        //copy elements in temporary arrays
        int n1 = m-l+1;
        int n2 = r-m;
        int [] left = new int[n1];
        int [] right = new int[n2]; //r-(m+1)+1 = r-m-1+1 = r-m
        
        for(int i = 0; i < n1; i++){
            left[i] = arr[i + l];
        }
        
        for(int i = 0; i < n2; i++){
            right[i] = arr[m+1+i];
        }
        
        int a = 0, b = 0, k = l;
        
        while(a < n1 & b < n2){
            if(left[a] <= right[b]){
                arr[k++] = left[a++];
            }else{
                //inversion
                res += (n1-a); // if the right element forms an inversion with left that it will forms an inversion with all successding
                //element in left[a]
                arr[k++] = right[b++];
            }
        }
        
        while(a < n1){
            //no need to calculate here since that will already covered by earlier call made for countAndMerge
            arr[k++] = left[a++];
        }
        
        while(b < n2){
            //no need to calculate here since that will already covered by earlier call made for countAndMerge
            arr[k++] = right[b++];
        }
        
        return res;
    }
    
    
    
}
