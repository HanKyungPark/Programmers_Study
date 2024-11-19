import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int a = array.length;
        
        if(a % 2 == 1){
            return array[array.length / 2];
        }else
            return array[array.length / 2 - 1] + array[array.length /2];
    }
}