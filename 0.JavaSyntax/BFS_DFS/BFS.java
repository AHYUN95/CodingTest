package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

/*
BFS
�ʺ� �켱 Ž��
��Ʈ ��忡�� �����ؼ� ������ ��带 ���� Ž���ϴ� ���
"ť"�� �̿��ϴ� ������ ��Ƴ��� ���ʴ�� pop()�Ͽ� ����
��� �湮�� �ݵ�� �湮 ���� �˻�
isVisti[idx] = true;
 
+ Ž���ؾ� �� ����� ���� ���ٸ� ���� ����
+ ��͹���� DFS�� ���� ������ ������ ��������� ���� �ʿ��� 
 */
public class BFS {

static int [][] map; //������ ���� ����
static boolean[] visited; // �湮 ����
static int n ; // ���� ����
static int m ; // ���� ��


	public static void main(String[] args) {
		visited = new boolean [n+1]; //���� �湮 ���� Ȯ��
		map = new int [n+1][n+1]; // ���� ���� ���� Ȯ��

	}
	
	static void bfs(int start) {
		
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start); //Ȯ�� �������� ������ �־���
		visited[start] =true;	//�湮üũ
		
		while(!queue.isEmpty()) {//ť�� �������� 
			int index = queue.poll(); //ù��° �� ��ȯ�ϰ� ����
			sb.append(index+" "); //queue���� ������ ����� �о���
			for(int i=1; i<=n;i++) {//��� ������ ���ؼ� Ȯ��
				if(map[index][i]==1 && visited[i] ==false) {//index�� ����Ǿ��� �ְ� ���� �湮�� ���� �ʾҴٸ�
					queue.offer(i); //ť�� �־���
					visited[i] =true;
				}
			}
		}
		System.out.println(sb);
	}

}
