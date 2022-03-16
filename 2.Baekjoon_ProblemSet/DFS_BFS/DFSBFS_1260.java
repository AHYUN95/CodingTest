package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * DFS : Depth-First Search 깊이 우선 탐색
 * BFS : Breath-First Search 너비 우선 탐색
 */
public class DFSBFS_1260 {

	static int n ;
	static int m;
	static int v;
	static boolean visited [] ;
	static int [][] map ;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str [] = br.readLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		v = Integer.parseInt(str[2]);
		
		visited = new boolean[n+1];
		map = new int [n+1][n+1];
		
		for(int i=0; i<m; i++) {
			String [] s = br.readLine().split(" ");
			map[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = 1;
			map[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = 1;
		}
		
		DFS(v);
		System.out.println();
		
		visited = new boolean[n+1]; // 다시 초기화
		
		BFS(v);
	}
	
	static void DFS(int start) {
		
		Stack<Integer> s = new Stack<>();
		
		s.push(start);
		visited[start] = true;
		System.out.print(start+" ");
		
		while(!s.isEmpty()) {
			for(int i=1; i<=n; i++) {
				if(map[start][i]==1 && visited[i]==false) {
					s.push(i);
					visited[i] = true;
					DFS(i);
				}
		}
		s.pop();
		}
	}
	static void BFS(int start) {
		
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(start);
		visited[start] =true;
		
		while(!q.isEmpty()) {
			int index = q.poll();
			sb.append(index+" ");	//BFS는 빼주는 순서를 읽어줌
			for(int i=1; i<=n; i++) {
				if(map[index][i]==1 && visited[i]==false) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		System.out.println(sb);
	}

}
