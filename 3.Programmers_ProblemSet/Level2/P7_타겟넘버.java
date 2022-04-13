package Level2;

import java.util.ArrayList;
import java.util.Stack;

public class P7_타겟넘버 {

	public static void main(String[] args) {
		int [] number = {1,1,1,1,1};
		int target = 3;
		System.out.println(solution(number, target));
	}
	
    
    static  int solution(int[] numbers, int target) {
    	int answer = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    //시작값
    stack.push(numbers[0]);
    stack.push(numbers[0]*(-1));

    for(int i=1; i<numbers.length; i++){
        //if) i=3이라면 i=0~i=2까지 경우의 수가 stack에 들어가 있다 이 경우의 수에 i=3일때 양수의 값 음수의 값을 경우의 수에 더해주는 것
        int nextnum = numbers[i];
        
        ArrayList<Integer> list = new ArrayList<Integer>(); //list에 순차적으로 더한 값을 넣어 줄 꺼임
        
        while(!stack.isEmpty()){
            int top = stack.pop();
            list.add(top + nextnum);
            list.add(top + nextnum*(-1));
        }
        //list에 적은 계산식은 stack에 적어준다.
        //if) i=3 >> i=0-i=3까지의 경우의 수가 stack에 들어가 있는 것!
        for(int j=0; j<list.size(); j++){
            stack.push(list.get(j));
        }
    }
    
    //stack에 들어있는 경우의 수 중에서 target과 맞는 값이 있으면 체크해주기
    for (int num : stack){
        if(num == target){
            answer++;
        }
    }
            
    return answer;
    }
}
