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
			int res = q.peek(); //�Ǿտ� �ִ°� ���� ����
			q.pop();
			q.offer(res);	//�� �ڷ� �ٽ� �־���
		}

		System.out.println(q.peek());
	}
}
