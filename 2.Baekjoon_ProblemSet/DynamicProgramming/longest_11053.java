package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longest_11053 {

	static int arr[];
	static Integer dp [];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String s [] = br.readLine().split(" ");
		arr = new int [N+1];
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(s[i-1]);
		}
		
		dp = new Integer [N+1];
		dp[0] = 0;
		dp[1] = 1;

		for(int i=2; i<=N; i++) {
			dp(i);
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max,dp[i]);
		}
		
		System.out.println(max);

	}
	
	static int dp(int n) {
		if(dp[n] == null) {
			dp[n]=1;
			for(int i=n-1; i>0; i--) {
				if(arr[i] < arr[n]) {
					//dp[n] 앞선 값과 , 다시 탐색한 dp(i)+1중에 큰 값을 반환한다.
					dp[n] = Math.max(dp[n],dp(i)+1);
				}
			}
		}
		return dp[n];
	}
}
