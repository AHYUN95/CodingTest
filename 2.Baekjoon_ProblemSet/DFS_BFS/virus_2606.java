package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class virus_2606 {

	static int n;
	static boolean visited [] ;
	static int map [][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		visited = new boolean [n+1];
		map = new int [n+1][n+1];
		
		for(int i=0; i<m; i++) {
			String str [] = br.readLine().split(" ");
			map [Integer.parseInt(str[0])][Integer.parseInt(str[1])] =1;
			map [Integer.parseInt(str[1])][Integer.parseInt(str[0])] =1;
		}
		bfs(1);
	}
	
	static void bfs(int start) {
		
		int count = 0;
		Queue <Integer> q = new LinkedList <>();
		
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int index = q.poll();
			count++;
			for(int i=1; i<=n; i++) {
				if(map[i][index]==1 && visited[i]==false) {
					q.offer(i);
					visited[i] =true;
				}
			}
		}
		System.out.println(count-1);
	}

}
