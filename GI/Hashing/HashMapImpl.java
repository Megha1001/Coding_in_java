import java.util.*;

class HashMapImpl{
    
    public static void main(String []args){
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        h.put("abc",1);
        h.put("def",2);
        h.put("ghi",3);
        
        System.out.println(h);
        System.out.println(h.size());
        for(Map.Entry<String, Integer>e : h.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        
        if(h.containsKey("abc")){
            System.out.println("It contains abc");
        }else{
            System.out.println("It doesn't contains abc");
        }
        
        h.remove("abc");
        System.out.println(h.size());
        
        if(h.containsValue(1)){
            System.out.println("It contains value=1");
        }else{
           System.out.println("It doesn't contains value=1");
        }
        System.out.println(h.get("def")); //returns corresponding value if present
        System.out.println(h.get("dev")); // returns null since value is not present
    }
    
}

/*
{abc=1, def=2, ghi=3}
3
abc : 1
def : 2
ghi : 3
It contains abc
2
It doesn't contains value=1
2
null
*/
