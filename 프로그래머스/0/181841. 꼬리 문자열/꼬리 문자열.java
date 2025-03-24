class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String arr : str_list){
            if(!(arr.contains(ex))){
                answer += arr;
            }
        }
        return answer;
    }
}