class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i < arr.length; i++){
            answer += arr[i];
        }
        double average = answer/(double) arr.length;
        return average;
    }
}