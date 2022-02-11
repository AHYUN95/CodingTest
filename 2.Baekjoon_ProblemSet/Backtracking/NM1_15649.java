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
	StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 넓이
		int M = Integer.parseInt(br.readLine()); // 깊이
		
		visit = new boolean[N]; //초기값 false
		arr = new int [M];
		
		nm(N,M,0); // 깊이 0 부터 시작
		
	}
		public static void nm (int N, int M, int depth) {
			if(depth == M) {
				for(int val : arr) {
					System.out.println(val+" ");
				}
				System.out.println();
			}
			
			for(int i=0; i<N; i++) {
				if(visit[i]==false) {//중복값 피하기 위해서 
					visit[i] = true;
					arr[depth] = i+1;
					nm(N,M,depth+1);
					visit[i] = false;
				}
				
			}
		}
		
	}

