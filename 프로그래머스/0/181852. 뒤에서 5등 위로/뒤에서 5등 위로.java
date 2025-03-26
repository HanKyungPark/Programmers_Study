import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int idx = 5;
        Arrays.sort(num_list);
        if(idx > num_list.length){
            return new int[]{};
        }
        return Arrays.copyOfRange(num_list, idx, num_list.length);
        
    }
}