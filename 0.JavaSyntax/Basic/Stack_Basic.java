package Basic;

import java.util.Stack;

public class Stack_Basic {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(); //StackClass ����ϱ�
		Stack<String> stack2 = new Stack<String>(); //char�� ����
		
		stack.push(1); // stack�� �� 1 �߰�
		stack.push(2); // stack�� �� 2 �߰�
		stack.pop(); //  stack���� ���� ���� �� ����
		stack.clear(); // stack�� ��ü �� ����
		stack.peek(); //stack�� ���� ���� �� ����
		stack.empty(); // stack�� ����ִ��� Ȯ��
		stack.size(); // stack ������ ��� : 2
		stack.contains(1); // stack �� 1�� �ִ��� check (�ִٸ� ���)
		
		
		//stack�� �� �� ���� ��
		int sum =0;
		for(int o :stack) {
			sum+= o;
		}
		
	}
	
}
