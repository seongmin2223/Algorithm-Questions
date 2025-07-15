import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = String.valueOf(n);
        for(int i=0; i < nStr.length(); i++){
            char digitChar = nStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            System.out.println("추출된 자릿수 : " + digit);
            answer += digit;
        }
        return answer;
    }
}