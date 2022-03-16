package Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus_11866 {

	public static void main(String[] args) {
	
		Queue<Integer> q = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
	
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		while(q.size()>1) {
			
			for(int i=1; i<k; i++) {
				int res = q.poll();
				q.offer(res);
			}
			sb.append(q.poll()+", ");
		}
		
		sb.append(q.poll()+">");
		System.out.println(sb);
	}

}
