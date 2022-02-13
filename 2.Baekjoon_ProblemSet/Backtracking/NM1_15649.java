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
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]); // ����
		M = Integer.parseInt(str[1]); // ����
		
		visit = new boolean[N]; //�ʱⰪ false, �湮 ���� Ȯ��
		arr = new int [M];
		
		nm(0); // dfs, �ʱ� depth 0���� �����Ѵ�.
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
				return; //nm(depth+1)���� ����Լ��� depth=M�� �����Ҷ� �Ʒ� �� ���� visit[i]=false
			}
			
			for(int i=0; i<N; i++) {
				if(visit[i]==false) {
					visit[i] = true; //i �湮ó��
					arr[depth] = i+1; //arr�� ���� �߰�
					nm(depth+1);	//arr deph���� �迭�� ���� ���� ã�´�.
					visit[i] = false; //return �Ǿ����� �迭 �湮���θ� false
				}
				
			}
		}
		
	}

