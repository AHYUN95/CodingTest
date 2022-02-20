package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longest_11053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String s [] = br.readLine().split(" ");
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
	
		int max = 0;
		
		for(int j=0; j<N; j++) {
			int count = 0;
			int index = 0; //count, index 를 초기화해줘야 한다.
			for(int i=j; i<N; i++) {
				if(index < arr[i]) {
					count++;
					index = arr[i];
				}
			}
			max = Math.max(max,count);
		}
		
		System.out.println(max);
	}
}
