package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Divisor_1037 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(arr);
		
		int result = arr[0]*arr[N-1];
		System.out.println(result);
	}
}
