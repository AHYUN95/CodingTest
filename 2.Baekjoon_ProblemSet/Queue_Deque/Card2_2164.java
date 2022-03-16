package Queue_Deque;

import java.util.LinkedList;
import java.util.Scanner;

public class Card2_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedList<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		for(int o:q) {
		System.out.println(o);
	}
		
		for(int i=1; i<n;i++) {
			q.pop();
			int res = q.peek(); //�Ǿտ� �ִ°� ���� ����
			q.pop();
			q.offer(res);	//�� �ڷ� �ٽ� �־���
		}
		for(int o:q) {
		System.out.println(o);
	}
	}
}
