package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Knapsack_12865 {
	
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
		
		Arrays.sort(wv, new Comparator <int[]> (){
			@Override
			public int compare(int[] c1, int[] c2) {
				return c1[0]-c2[0];
			}
		});
		//dp에 앞에서 부터 더한 무게, 가치 넣어 줄꺼임
		int dp [][] = new int [n][2];
		dp[0][0] = wv[0][0];
		dp[0][1] = wv[0][1];
	

			for(int i=1; i<n; i++) {
			if(dp[i-1][0]+wv[i][0]<=k) {
				dp[i][1] = dp[i-1][1]+wv[i][1];
				dp[i][0] = dp[i-1][0]+wv[i][0];	
			}
			else {
				dp[i][0] = dp[i-1][0];
				dp[i][1] = dp[i-1][1];
				for(int j=i-1; j>0; j--) {
					if(dp[j][0]+wv[i][0]<=k) {
						dp[i][1] = Math.max(dp[j][1]+wv[i][0],dp[i-1][1]);
						if(dp[i][1]==dp[i-1][1]) {
							dp[i][0] = dp[i-1][0];
						}else {
							dp[i][0] = dp[j][0]+wv[i][0];
						}
					break;
					}
				}
			}
		}
		System.out.println(dp[n-1][1]);

	}

}
