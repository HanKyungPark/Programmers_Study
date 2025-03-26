import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int idx = 5;
        Arrays.sort(num_list);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < idx;i++){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}