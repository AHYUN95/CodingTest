package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartLink_14889 {

	static int N;
	static int [][] iarr;
	static boolean [] visit;
	static int Min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		N = Integer.parseInt(br.readLine());
			
		iarr = new int [N][N];
			for(int i=0; i<N; i++) {
				String [] s = br.readLine().split(" ");{
					for(int j=0; j<N;j++) {
						iarr[i][j] = Integer.parseInt(s[j]);
					}
				}
			}
		
		visit = new boolean [N];

		dfs(0,0);
		
		System.out.println(Min);
	}

//start�� ���� ����°� ���� ����, idex�� ���� 
public static void dfs(int start, int idex) {
	
	if(idex==N/2) {//N/2 ������� ���յ� ���� ��������� ��� ��
		diff();
		return;
	}

	for(int i=start; i<N;i++) {	//�ݺ�������� ����
		if(visit[i]==false) {
			visit[i]=true;
			dfs(i+1,idex+1);
			visit[i]=false;	//��Ͱ� ������ �ٽ� �湮�� false�� �����ش�.
		}
	}
}

//���� ���
public static void diff() {
	int t_start =0;
	int t_link = 0;
	
	for(int i=0; i<N-1;	i++) {
		for(int j=i+1; j<N;j++) {
			//true�̸� t_start�� �Ҽ�
			if(visit[i]==true && visit[j]==true) {
				t_start += iarr[i][j]+iarr[j][i];
			}
			//false�̸� t_link�� �Ҽ�
			else if (visit[i]==false&&visit[j]==false) {
				t_link += iarr[i][j]+iarr[j][i];
			}
		}
	}
	
	int diff = Math.abs(t_start - t_link);
	
	//���̰� 0�̸� �� Ȯ���� �ʿ䵵 ����. �׳� ������
	if(diff==0) {
		System.out.println(diff);
		System.exit(0);
	}
	
	Min = Math.min(Min, diff);
	
	}
}