package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bridge_1010 {
	
	static Integer dp [][] = new Integer [30][30];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		int arr [][] = new int [t][2];
		
		for(int i=0; i<t; i++) {
			
			String str [] = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
	
			sb.append(dp(arr[i][1],arr[i][0])+"\n");
		}
		System.out.println(sb);
	}
	
	static int dp(int n, int r) {
		
		if(n==r || r==0) {
			return dp[n][r] = 1;
		}
		
		if(dp[n][r] == null) {
			//n+1Cr+1 = nCr + nCr+1 		
			return dp[n][r]=dp(n-1,r-1)+dp(n-1,r);
		}
		
		return dp[n][r];

	}
}
