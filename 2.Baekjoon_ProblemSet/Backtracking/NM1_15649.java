package Backtracking;
/*
백트래킹 
1. 어떤 노드의 유망성(탐색 가능성) 체크 
	1-1 탐색 가능하면 그대로 탐색 //깊이 우선 탐색(DFS)를 수행하면서
	1-2 탐색이 가능하지 않으면 그 노드의 부모노드로 되돌아간 후
		다른 자식 노드를 탐색
		
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NM1_15649 {
	static boolean[] visit;
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]); // 넓이
		M = Integer.parseInt(str[1]); // 깊이
		
		visit = new boolean[N]; //초기값 false, 방문 여부 확인
		arr = new int [M];
		
		nm(0); // dfs, 초기 depth 0부터 시작한다.
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
		
	}
		public static void nm (int depth) {
			if(depth == M) {
				for(int val : arr) {
					sb.append(val+" ");
				}
				sb.append("\n");
				return; //nm(depth+1)여기 재귀함수가 depth=M을 만족할때 아래 줄 실행 visit[i]=false
			}
			
			for(int i=0; i<N; i++) {
				if(visit[i]==false) {
					visit[i] = true; //i 방문처리
					arr[depth] = i+1; //arr에 값을 추가
					nm(depth+1);	//arr deph다음 배열에 넣을 값을 찾는다.
					visit[i] = false; //return 되었을때 배열 방문여부를 false
				}
				
			}
		}
		
	}

