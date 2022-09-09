//Question : https://leetcode.com/problems/rotting-oranges/submissions/

class Solution {
    
    
    static class Ele{
        int x;
        int y;
        
        Ele(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
    
    public int orangesRotting(int[][] grid) {

        Queue<Ele> q = new LinkedList<>();
        Ele temp;
        int ans = 0;
        
        //add the rotten oranges to the queue
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length ;j++){
                if(grid[i][j] == 2){
                    q.add(new Ele(i,j));
                }
            }
        }
        
        //add delimiter
        q.add(new Ele(-1,-1));
        
        while(!q.isEmpty()){
            boolean flag = false;
            
           
            //not a delimiter
            while(!isDelimiter(q.peek())){
                
                temp = q.peek();
                
                //right
                if(isValid(temp.x + 1 , temp.y,grid.length,grid[0].length) && grid[temp.x + 1][temp.y] == 1){
                    
                    if(!flag){
                        
                        ans++;
                        flag = true;
                    }
                    grid[temp.x + 1][temp.y] = 2;
                    temp.x++;
                    q.add(new Ele(temp.x, temp.y));
                    temp.x--;
                    
                }
                
                //left
                if(isValid(temp.x - 1 , temp.y,grid.length,grid[0].length) && grid[temp.x - 1][temp.y] == 1){
                    
                    if(!flag){
                        
                        ans++;
                        flag = true;
                    }
                    grid[temp.x - 1][temp.y] = 2;
                    temp.x--;
                    q.add(new Ele(temp.x, temp.y));
                    temp.x++;
                    
                }
                
                //top
                if(isValid(temp.x , temp.y - 1,grid.length,grid[0].length) && grid[temp.x][temp.y - 1] == 1){
                    
                    if(!flag){
                        
                        ans++;
                        flag = true;
                    }
                    grid[temp.x][temp.y - 1] = 2;
                    temp.y--;
                    q.add(new Ele(temp.x, temp.y));
                    temp.y++;
                    
                }
                
                //bottom
                if(isValid(temp.x , temp.y + 1,grid.length,grid[0].length) && grid[temp.x][temp.y + 1] == 1){
                    
                    if(!flag){
                        
                        ans++;
                        flag = true;
                    }
                    grid[temp.x][temp.y + 1] = 2;
                    temp.y++;
                    q.add(new Ele(temp.x, temp.y));
                    temp.y--;
                    
                }
                
                
                q.remove();
                
            }
           
            q.remove();
            
            if(!q.isEmpty()){
                q.add(new Ele(-1,-1));
            }
        }
        
        return checkAll(grid) ? -1 : ans;
        
    }
    
    static boolean isDelimiter(Ele temp){
        
        return temp.x == -1 && temp.y == -1;
    }
    
    static boolean isValid(int x, int y, int i , int j){
        
        return x >= 0 && y >=0 && x < i && y < j;
        
    }
    
    static boolean checkAll(int arr[][]){
        for(int i  = 0; i < arr.length; i++){
            for(int j  = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
