package Backtracking;
/*
��Ʈ��ŷ 
1. � ����� ������(Ž�� ���ɼ�) üũ 
	1-1 Ž�� �����ϸ� �״�� Ž�� //���� �켱 Ž��(DFS)�� �����ϸ鼭
	1-2 Ž���� �������� ������ �� ����� �θ���� �ǵ��ư� ��
		�ٸ� �ڽ� ��带 Ž��
		
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
		
		int N = Integer.parseInt(br.readLine()); // ����
		int M = Integer.parseInt(br.readLine()); // ����
		
		visit = new boolean[N]; //�ʱⰪ false
		arr = new int [M];
		
		nm(N,M,0); // ���� 0 ���� ����
		
	}
		public static void nm (int N, int M, int depth) {
			if(depth == M) {
				for(int val : arr) {
					System.out.println(val+" ");
				}
				System.out.println();
			}
			
			for(int i=0; i<N; i++) {
				if(visit[i]==false) {//�ߺ��� ���ϱ� ���ؼ� 
					visit[i] = true;
					arr[depth] = i+1;
					nm(N,M,depth+1);
					visit[i] = false;
				}
				
			}
		}
		
	}

