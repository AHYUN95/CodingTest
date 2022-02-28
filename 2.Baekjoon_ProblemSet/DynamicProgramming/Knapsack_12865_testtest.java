package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knapsack_12865_testtest {

	static int dp[][];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 [] = br.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		int k = Integer.parseInt(s1[1]);
		
		int wv [][] = new int [n][2];
		
		for(int i=0; i<n; i++) {
			String s [] = br.readLine().split(" ");
			wv[i][0] = Integer.parseInt(s[0]);
			wv[i][1] = Integer.parseInt(s[1]);
		}
		
		dp = new int [n][2];
		dp[0][0] = wv[0][0];
		dp[0][1] = wv[0][1];
		for(int i=1; i<n; i++) {
			dp[i][0] = dp[i-1][0]+wv[i][0];
			dp[i][1] = dp[i-1][1]+wv[i][1];
		}
		
		int index = dp(k);
		
		if(index==k) {
			System.out.println(dp[k][1]);
		}
		
	}
	
	static int dp(int k) {
		int i=0;
		while(dp[i][0] < k) {
			i++;
			break;
		}
		return i;
	}

}
