package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

/*
BFS
너비 우선 탐색
루트 노드에서 시작해서 인접한 노드를 먼저 탐색하는 방법
"큐"에 이웃하는 정점을 담아놓고 차례대로 pop()하여 구현
노드 방문시 반드시 방문 여부 검사
isVisti[idx] = true;
 
+ 탐색해야 할 노드의 수가 많다면 좋지 않음
+ 재귀방식인 DFS에 비해 정점을 저장할 저장공간이 많이 필요함 
 */
public class BFS {

static int [][] map; //정점들 연결 정보
static boolean[] visited; // 방문 정보
static int n ; // 정점 갯수
static int m ; // 간선 수


	public static void main(String[] args) {
		visited = new boolean [n+1]; //정점 방문 여부 확인
		map = new int [n+1][n+1]; // 간선 연결 정보 확인

	}
	
	static void bfs(int start) {
		
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start); //확인 시작해줄 정점을 넣어줌
		visited[start] =true;	//방문체크
		
		while(!queue.isEmpty()) {//큐가 빌때까지 
			int index = queue.poll(); //첫번째 값 반환하고 삭제
			sb.append(index+" "); //queue에서 나가는 순대로 읽어줌
			for(int i=1; i<=n;i++) {//모든 정정에 대해서 확인
				if(map[index][i]==1 && visited[i] ==false) {//index와 연결되어져 있고 아직 방문이 되지 않았다면
					queue.offer(i); //큐에 넣어줌
					visited[i] =true;
				}
			}
		}
		System.out.println(sb);
	}

}
