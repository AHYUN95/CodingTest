package Queue_Deque;

import java.util.LinkedList;
import java.util.Scanner;

public class Card2_2164 {

	public static void main(String[] args) {
		
		LinkedList<Integer> q = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		
		for(int i=1; i<n;i++) {
			q.pop();
			int res = q.peek(); //맨앞에 있는걸 빼준 다음
			q.pop();
			q.offer(res);	//맨 뒤로 다시 넣어줌
		}

		System.out.println(q.peek());
	}
}
