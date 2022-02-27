package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousSum_1912 {
	
	static int arr [] ;
	static Integer sum [];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n];
		String str [] = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		sum = new Integer [n];
		sum[0] = arr[0];
		
		for(int i=0; i<n; i++) {
			sum(i);
		}
		
		Arrays.sort(sum);
		System.out.println(sum[n-1]);
	}

	//arr[s]로 수열이 끝남
	static int sum(int s) {
		
		if(sum[s]==null) {
			return sum[s] = Math.max(sum(s-1)+arr[s], arr[s]);
		}
		return sum[s];
	}

}
