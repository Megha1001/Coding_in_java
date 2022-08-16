// search and erase has only one line of difference in implementation

class OpenAddressingLinearProbing{
    
    static class MyHash{
        // cap - > capacity of Hashtable, size -> how many places are already occupied
        int cap, size;
        int [] arr;
        
        MyHash(int c){
            cap = c;
            size = 0;
            arr = new int[c];
            for(int i = 0; i < c; i++){
                arr[i] = -1; // entry is not occupied
            }
        }
        
        int hash(int key){
        return key % cap;
    }
    
    
    boolean search(int key){
        int h = hash(key);
        int i = h;
        
        while(arr[i] != -1){
            if(arr[i] == key){
                return true;
            }
            // linear probing
            i = (i+1) % cap;
            
            //traversed whole table but key not found
            if(i == h){
                return false;
            }
        }
        
        return false;
    }
    
    boolean insert(int key){
        // no space left in table
        if(size == cap){
            return false;
        }
        
        int h = hash(key);
        
        // continue linear probing until all conditions not meet
        // -1 --> entry is not occupied, -2 --> previous entry is deleted , can be used for new insertion
        while(arr[h] != -1 && arr[h] != -2 && arr[h] != key){
            h = (h +1) % cap;
        }
        
        if(arr[h] == key){
            return false; // entry already exists
        }
        else{
            arr[h] = key;
            ++size;
            return true;
        }
    } 
    
    boolean erase(int key){
        int h = hash(key);
        int i = h;
        
        while(arr[i] != -1){
            if(arr[i] == key){
                arr[i] = -2; // insert delete marker
                return true;
            }
            //linear probing
            i = (i+1) % cap;
            
            // traversed whole hash table but key not found
            if(i == h){
                return false;
            }
        }
        
        return false; // not found
    }
    }
    
    
    
    public static void main(String [] args){
          MyHash mh = new MyHash(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.erase(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
    }
}
