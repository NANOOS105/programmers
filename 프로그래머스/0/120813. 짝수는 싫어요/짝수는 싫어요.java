import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n+1; i++){
            if(i%2==1){
                list.add(i);
            }
        }
        
        return list;
    }
}