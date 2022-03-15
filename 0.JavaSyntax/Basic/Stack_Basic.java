package Basic;

import java.util.Stack;

public class Stack_Basic {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(); //StackClass 사용하기
		Stack<String> stack2 = new Stack<String>(); //char형 스택
		
		stack.push(1); // stack에 값 1 추가
		stack.push(2); // stack에 값 2 추가
		stack.pop(); //  stack에서 가장 위에 값 제거
		stack.clear(); // stack의 전체 값 제거
		stack.peek(); //stack의 가장 위에 값 제거
		stack.empty(); // stack이 비어있는지 확인
		stack.size(); // stack 사이즈 출력 : 2
		stack.contains(1); // stack 에 1이 있는지 check (있다면 출력)
		
		
		//stack의 총 합 구할 때
		int sum =0;
		for(int o :stack) {
			sum+= o;
		}
		
	}
	
}
