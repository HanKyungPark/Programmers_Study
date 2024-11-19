import java.util.*;
class Solution {
    public int solution(String my_string) {
        String arr = my_string.replaceAll("[^0-9]","");
        
        int sum = 0;
        for (char ch : arr.toCharArray()){
            sum += ch -'0';
        }
        return sum;
        
    }
}