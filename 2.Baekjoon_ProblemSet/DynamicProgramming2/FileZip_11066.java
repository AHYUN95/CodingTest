package DynamicProgramming2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileZip_11066 {
	
	static int arr [];
	static Integer dp [];
	static int size [];
	
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int T = Integer.parseInt(br.readLine());
	
	for(int i=0; i<T; i++) {
		
		int K  = Integer.parseInt(br.readLine());
		arr = new int [K];
		dp = new Integer[K];
		String str [] = br.readLine().split(" ");
		
		for(int j=0; j<K; j++) {		
			arr[j] = Integer.parseInt(str[j]);
		}
		
		dp[0] = 0;
		dp[1] = arr[1]+arr[0];
		
		//k까지의 size 확인해주는 
		size = new int [K];
		size[0] = arr[0];
		for(int l=1; l<K; l++) {
			size[l] = size[l-1] + arr[l];
		}
	
		System.out.println(Cost(K-1));
		for(int y=0; y<K; y++) {
			System.out.println(dp[y]);
		}
		    
		}
	}
	
	
	
	//n>=2
	static int Cost(int n) {
		
		if(dp[n]==null) {
				return dp[n] = Math.min(Cost(n-1)+size[n-1]+arr[n], 2*(arr[n-1]+arr[n])+Cost(n-2)+size[n-2]);
		}
		return dp[n];
		}
	}
