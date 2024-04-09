class Solution {
    public int solution(int a, int b) {
        String aa=String.valueOf(a);
        String bb=String.valueOf(b);
        int answer = Integer.parseInt(aa+bb);

        if (Integer.parseInt(aa + bb) < (2 * a * b)) {
            return (2 * a * b);
        } else {
            return answer;
        } 
        
    }
}
