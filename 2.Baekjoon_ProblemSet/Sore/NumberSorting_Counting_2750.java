package Sore;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberSorting_Counting_2750{
	//백준 2750, Counting
	//중복되는 수가 없을 때 받을 수 있음
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
		 * 0은 Index[1000]
		 */
		
		boolean[] b = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			b[arr[i]+1000] = true;
		}
		
		//정렬 과정 필요 없음
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<2001; i++) {
			if(b[i]) {
				sb.append(i-1000).append('\n');
			}
		}System.out.print(sb);
	}
}
