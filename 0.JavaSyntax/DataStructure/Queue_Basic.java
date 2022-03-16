package DataStructure;

import java.util.LinkedList;
/*
 LinkedList사용해서 queue 사용하기
 */
import java.util.Queue;

public class Queue_Basic {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1); //값 추가
		queue.offer(2); //값 추가
		queue.poll(); //첫번쨰 값을 반환하고 제거
		queue.remove(); // 첫번째 값 제거
		queue.clear(); // queue 초기화
		queue.peek(); //첫번째 값 참조
		
		
		
		/*
		Queue<Integer> q = new LinkedList<>();
		해당 경우에는 맨 뒤의 원소를 반환하는 메소드가 없다.
		*/
		LinkedList<Integer> q = new LinkedList<>();
		q.offer(1); //추가
		q.pop(); // 삭제
		q.size();
		q.isEmpty();
		q.peek();	//맨 앞의 수 반환
		q.peekLast(); // 맨 뒤의 수 반환
	}

}
