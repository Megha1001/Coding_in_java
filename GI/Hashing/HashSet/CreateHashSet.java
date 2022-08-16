// Order is not guranteed

import java.util.*;

class HashSetImpl{
    
    public static void main(String []args){
        HashSet<String> h = new HashSet<String>(); // can specify initial capacity for optimization
        h.add("abc");
        h.add("def");
        h.add("ghi");
        
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("def"));
        
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
     
        System.out.println("-------------");
        for(String s : h){
            System.out.print(s +" ");
        }   
        
        System.out.println(h.remove("def"));
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());
    }
    
}

/*
[abc, def, ghi]3
true
abc def ghi -------------
abc def ghi true
2
false
true
*/

/*
Time Complexity : add, remove, contains --> O(1) on average
size, isEmpty --> O(1) --> internally maintened with the collection
*/
