package Level2;

import java.util.Stack;

public class P08_짝지어_제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solution(String s)
    {
        int answer = -1;
            
        Stack<Character> stack = new Stack<Character>();
        
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue; //여기서 for문 멈추고 다음 for문 i문 돈다.
            }
            
            if(stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        if(stack.size()==0){
            answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }

}
