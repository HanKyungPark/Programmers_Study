class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer++;
            n -=7;
        }
        return answer;
    
    }
}