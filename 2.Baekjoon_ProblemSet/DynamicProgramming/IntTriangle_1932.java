package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntTriangle_1932 {
	
	static int n;
	static int [][] tarr;
	static int [][] sum; //S함수 결과값 넣어줄꺼임
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		tarr = new int [n][n];
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			for(int j=0; j<i+1; j++) {
				tarr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		sum = new int [n][n];
		
		int result = 0;
		
		for(int i=0; i<n; i++) {
			result = Math.max(result,S(n-1,i));
		}
		
		System.out.println(result);
		
	}

	//N몇번째 깊이 인지 삼각형(제일 깊은것이 n-1), last는 마지막에 선택된 숫자 배열 순서(0~n-1)
	static int S(int N, int last) {
		
		if(sum[N][last]!=0) {
			return sum[N][last];
		}
		
		if(N==0) {
			return sum[N][last] = tarr[0][0];
		}else {	
			if(last==0) {
				return sum[N][last] = S(N-1,0) + tarr[N][0];
				}
			else if(last==N) {
				return sum[N][last] = S(N-1,last-1) + tarr[N][last];
				}
			else{
				return sum[N][last] = Math.max(S(N-1,last-1),S(N-1,last))+tarr[N][last];
		}
			
	}
	}
}
