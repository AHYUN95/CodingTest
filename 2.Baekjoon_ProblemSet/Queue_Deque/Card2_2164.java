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
			int res = q.peek(); //맨앞에 있는걸 빼준 다음
			q.pop();
			q.offer(res);	//맨 뒤로 다시 넣어줌
		}
		for(int o:q) {
		System.out.println(o);
	}
	}
}
