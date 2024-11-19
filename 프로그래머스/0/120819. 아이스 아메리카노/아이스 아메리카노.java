class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int q = 5500;
        
        answer[0] = money / q;
        answer[1] = money % q;
        
        return answer;
        
        
        
    }
}