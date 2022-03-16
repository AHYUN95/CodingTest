package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knapsack_12865 {

	static Integer dp[][];
	static int w[];
	static int v[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 [] = br.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		int k = Integer.parseInt(s1[1]);
		
		w= new int [n+1];
		v= new int [n+1];
		
		for(int i=1; i<=n; i++) {
			String s2 [] = br.readLine().split(" ");
			w[i] = Integer.parseInt(s2[0]);
			v[i] = Integer.parseInt(s2[1]);
		}
		
			dp = new Integer [n+1][k+1];
			System.out.println(K(n,k));
		
	}
	//무게 k에 대해서 w[i] 까지 확인했을 때 최대값을 더 해준다.
	static int K(int i, int k) {
		
		if(dp[i][k]==null) {
			
			if(i==0 || k==0) {
				return dp[i][k] =0;
			}
			if(w[i]>k) {
				return dp[i][k] = K(i-1,k);
			}
			if(w[i]<=k) {
				return dp[i][k] = Math.max(K(i-1,k-w[i])+v[i],K(i-1,k));
			}
		}
		return dp[i][k];
		
		
	}
	
}
