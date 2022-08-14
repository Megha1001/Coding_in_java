import java.util.*;

class TreeMapExample{
    
    public static void main(String [] args){
        TreeMap<Integer, String> t = new TreeMap<Integer, String>();
        t.put(10, "megha");
        t.put(11, "java");
        t.put(12, "developer");
        t.put(1, "So");
        
        System.out.println(t);
        System.out.println(t.containsKey(10));
        
        // print in sorted order
        for(Map.Entry<Integer, String> e : t.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
        //return value if key is present otherwise return null
        t.remove(10);
        System.out.println(t.size());
        
        System.out.println("----------------------");
        System.out.println(t.higherKey(10));
        System.out.println(t.lowerKey(10));
        System.out.println(t.floorKey(10));
        System.out.println(t.ceilingKey(10));
        
        System.out.println("----------------------");
        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
    }
    
}
