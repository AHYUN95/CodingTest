package DataStructure;

import java.util.LinkedList;
/*
 LinkedList����ؼ� queue ����ϱ�
 */
import java.util.Queue;

public class Queue_Basic {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1); //�� �߰�
		queue.offer(2); //�� �߰�
		queue.poll(); //ù���� ���� ��ȯ�ϰ� ����
		queue.remove(); // ù��° �� ����
		queue.clear(); // queue �ʱ�ȭ
		queue.peek(); //ù��° �� ����
		
		
		
		/*
		Queue<Integer> q = new LinkedList<>();
		�ش� ��쿡�� �� ���� ���Ҹ� ��ȯ�ϴ� �޼ҵ尡 ����.
		*/
		LinkedList<Integer> q = new LinkedList<>();
		q.offer(1); //�߰�
		q.pop(); // ����
		q.size();
		q.isEmpty();
		q.peek();	//�� ���� �� ��ȯ
		q.peekLast(); // �� ���� �� ��ȯ
	}

}
