class Solution {
    public int solution(int a, int b) {
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        int answer = Integer.parseInt(aa + bb);
        int answer2 = Integer.parseInt(bb + aa);

        if (answer > answer2) {
            return answer;
        } else {
            return answer2;
        }



    }
}