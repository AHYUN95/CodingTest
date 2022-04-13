package Level2;

import java.util.ArrayList;
import java.util.Stack;

public class P7_Ÿ�ٳѹ� {

	public static void main(String[] args) {
		int [] number = {1,1,1,1,1};
		int target = 3;
		System.out.println(solution(number, target));
	}
	
    
    static  int solution(int[] numbers, int target) {
    	int answer = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    //���۰�
    stack.push(numbers[0]);
    stack.push(numbers[0]*(-1));

    for(int i=1; i<numbers.length; i++){
        //if) i=3�̶�� i=0~i=2���� ����� ���� stack�� �� �ִ� �� ����� ���� i=3�϶� ����� �� ������ ���� ����� ���� �����ִ� ��
        int nextnum = numbers[i];
        
        ArrayList<Integer> list = new ArrayList<Integer>(); //list�� ���������� ���� ���� �־� �� ����
        
        while(!stack.isEmpty()){
            int top = stack.pop();
            list.add(top + nextnum);
            list.add(top + nextnum*(-1));
        }
        //list�� ���� ������ stack�� �����ش�.
        //if) i=3 >> i=0-i=3������ ����� ���� stack�� �� �ִ� ��!
        for(int j=0; j<list.size(); j++){
            stack.push(list.get(j));
        }
    }
    
    //stack�� ����ִ� ����� �� �߿��� target�� �´� ���� ������ üũ���ֱ�
    for (int num : stack){
        if(num == target){
            answer++;
        }
    }
            
    return answer;
    }
}
