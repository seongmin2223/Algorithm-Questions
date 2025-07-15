class Solution{
    public double solution(int[] numbers){
        double sum = 0;
        for(int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = sum/(double) numbers.length;
        return average;
    }    
}