class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if(num == 1){
                answer = 0;
            }
        
        while(num != 1){
            if(answer == 500){
                answer = -1;
                break;
            }
            num = (0 == num % 2) ? num / 2 : (num*3) + 1;
            answer++;
        }
        
        return answer;
    }
}