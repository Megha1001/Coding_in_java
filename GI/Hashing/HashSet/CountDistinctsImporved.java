import java.util.*;

class CountDistinctsImporved{
    
    public static void main(String []args){
        Integer[] input = {15,12,13,12,13,13,18};
        HashSet<Integer> h = new HashSet<>(Arrays.asList(input));
        System.out.println("Distinct elements : "+h.size());
    }
    
}
