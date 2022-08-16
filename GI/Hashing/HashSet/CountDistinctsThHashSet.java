import java.util.*;

class CountDistinctsThHashSet{
    
    public static void main(String []args){
        int[] input = {15,12,13,12,13,13,18};
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i = 0 ;i < input.length; i++){
            h.add((Integer)input[i]);
        }
        
        System.out.println("Distinct elements : "+h.size());
        
       
    }
    
}
