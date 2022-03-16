package BFS_DFS;

import java.util.Stack;

/*
DFS
���� �켱 Ž����
���������� ���� �б�� �Ѿ�� ���� �ش� �б⸦ �Ϻ��ϰ� Ž���ϰ� �Ѿ�� ���
"����Լ�" "����"���� ����
��� �湮�� �ݵ�� �湮 ���� �˻�
isVisit[idx] =true;

+ ������ BFS�� ���� �����ϳ� �˻� �ӵ��� BFS�� ���� ����
 */
public class DFS {
	
	static int [][] map; //������ ���� ����
	static boolean[] visited; // �湮 ����
	static int n ; // ���� ����
	static int m ; // ���� ��

	public static void main(String[] args) {
		visited = new boolean [n+1]; //���� �湮 ���� Ȯ��
		map = new int [n+1][n+1]; // ���� ���� ���� Ȯ��

	}
	
	
	static void dfs(int start) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(start); //ó�� ���� ������ �־��ش�.
		visited[start] = true;
		System.out.print(start+" "); //stack�� ������ ������� �о��ش�.
	
	while(!stack.isEmpty()) {
		for(int i=1; i<=n; i++) {
			if(map[i][start] ==1 && visited[i]==false) {//����Ǿ��� �ְ� �湮���� �ʾҴٸ�
				stack.push(i); // ������ �ִٸ� �־���
				visited[i] =true;
				dfs(i); // ������ i�� ���ؼ� ���
			}
		}
		stack.pop();
		}	
	}
}
