class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z'){
                arr[i] = arr[i].toUpperCase();
            }else if(arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z'){
                arr[i] = arr[i].toLowerCase();
            }
        }
        return String.join("",arr);
    }
}