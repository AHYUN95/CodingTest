package Level2;

import java.util.Stack;

public class P08_¦����_�����ϱ� {

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
                continue; //���⼭ for�� ���߰� ���� for�� i�� ����.
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
