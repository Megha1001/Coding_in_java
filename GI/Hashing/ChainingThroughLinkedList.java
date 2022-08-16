import java.util.*;

class ChainingThroughLinkedList{
    
    int BUCKET;
    
    ArrayList<LinkedList<Integer>> table;
    
    ChainingThroughLinkedList(int b){
        BUCKET = b;
        
        table = new ArrayList<LinkedList<Integer>>();
        
        for(int i = 0; i < b; i++){
            table.add(new LinkedList<Integer>());
        }
    }
    
    
    void insert(int key){
        int i = key % BUCKET;
        table.get(i).add(key);
    }
    
    void remove(int key){
        int i = key % BUCKET;
        table.get(i).remove((Integer)i);
    }
    
    boolean search(int key){
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }
    
    public static void main(String [] args){
      ChainingThroughLinkedList mh = new ChainingThroughLinkedList(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    mh.insert(14);
	    System.out.println(mh.search(10));
	    System.out.println(mh.search(14));
	    mh.remove(15);
	    System.out.println(mh.search(15));
    }
}

/*
true
true
true
*/
