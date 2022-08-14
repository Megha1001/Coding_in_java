import java.util.*;

class TreeSet{
    public static void main(String [] args){
        TreeSet<String> s = new TreeSet<String>();
        
        s.add("megha");
        s.add("altice");
        s.add("account");
        
        System.out.println(s);
        
        System.out.println(s.contains("megha"));
        
        Iterator<String> i = s.iterator();
        
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        
        
        TreeSet<Integer> s2 = new TreeSet<Integer>();
        s2.add(5);
        s2.add(4);
        s2.add(4);
        s2.add(1);
        s2.add(7);
        s2.remove(1);
        
        System.out.println(s2);
        System.out.println(s2.lower(5));
        System.out.println(s2.higher(5));
        System.out.println(s2.floor(5));
        System.out.println(s2.ceiling(5)); // returns null when not exist
        System.out.println(s2.floor(1));
        
        for(Integer x : s2){
            System.out.print(x +" ");
        }
       
    }
}


/*
java -cp /tmp/SRJmtFIfRv Test
[account, altice, megha]
true
account altice megha [4, 5, 7]
4
7
5
5
null
4 5 7 
*/
