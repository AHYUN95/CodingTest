package Sore;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberSorting_Counting_2750{
	//���� 2750, Counting
	//�ߺ��Ǵ� ���� ���� �� ���� �� ����
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		/*
		 * range : -1000 ~ 1000 
		 * N = 1-1000 input
		 * 0�� Index[1000]
		 */
		
		boolean[] b = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			b[arr[i]+1000] = true;
		}
		
		//���� ���� �ʿ� ����
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<2001; i++) {
			if(b[i]) {
				sb.append(i-1000).append('\n');
			}
		}System.out.print(sb);
	}
}
