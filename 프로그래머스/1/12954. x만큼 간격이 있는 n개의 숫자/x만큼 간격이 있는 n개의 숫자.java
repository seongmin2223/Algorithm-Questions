import java.util.Stack;

class Solution {
    public long[] solution(long x, long n) {
        Stack<Long> stack = new Stack<>();
        stack.push(x);
        
        long NUMBER = x;
        
        for(int i= 1; i < n; i++) {
            x += NUMBER;
            stack.push(x);
        }
        
        long[] answer = new long[stack.size()];
        
        for(int j = 0; j < answer.length; j++) {
            answer[j] = stack.get(j);
        }
        return answer;
    }
}