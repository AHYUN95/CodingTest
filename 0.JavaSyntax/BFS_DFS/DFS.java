package BFS_DFS;

import java.util.Stack;

/*
DFS
깊이 우선 탐색법
시작점부터 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하고 넘어가는 방법
"재귀함수" "스택"으로 구현
노드 방문시 반드시 방문 여부 검사
isVisit[idx] =true;

+ 구현은 BFS에 비해 간단하나 검색 속도는 BFS에 비해 느림
 */
public class DFS {
	
	static int [][] map; //정점들 연결 정보
	static boolean[] visited; // 방문 정보
	static int n ; // 정점 갯수
	static int m ; // 간선 수

	public static void main(String[] args) {
		visited = new boolean [n+1]; //정점 방문 여부 확인
		map = new int [n+1][n+1]; // 간선 연결 정보 확인

	}
	
	
	static void dfs(int start) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(start); //처음 시작 정점을 넣어준다.
		visited[start] = true;
		System.out.print(start+" "); //stack에 들어오는 순서대로 읽어준다.
	
	while(!stack.isEmpty()) {
		for(int i=1; i<=n; i++) {
			if(map[i][start] ==1 && visited[i]==false) {//연결되어져 있고 방문하지 않았다면
				stack.push(i); // 인접해 있다면 넣어줌
				visited[i] =true;
				dfs(i); // 인접한 i에 대해서 재귀
			}
		}
		stack.pop();
		}	
	}
}
