package DataStructure;

import java.util.LinkedList;
/*
 LinkedList����ؼ� queue ����ϱ�
 */

public class Queue_Basic {

	public static void main(String[] args) {
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
