class Solution {
        public int solution(int a, int b) {
        int c = 2;

        int answer = 0;

        if(a%2==1 || b%2==1){
            if (a%2==0 || b%2==0){
                //홀짝 조합
                answer = 2*(a+b);
            }
            else {
                //두놈다 홀수
                answer = a*a+b*b;
            }
        }
        else {
            //둘다 짝수일때
            answer = Math.abs(a-b);
        }
        return answer;
    }
}



