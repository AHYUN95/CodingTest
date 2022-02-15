package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * DP의 특징 대부분, 재귀+Memoization
 * 
 */
public class HappyFunction2_9184 {
	static int [][][] dp = new int [21][21][21];
	static int a;
	static int b;
	static int c;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String [] str = br.readLine().split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			sb.append("w("+a+", "+b+", "+c+") = "+w(a,b,c)+"\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static int w (int a, int b, int c) {
		//이미 저장된 값이면 저장된 값 나타내기, 이게 없으면 시간 초과 나온다.. 너무 많이 재귀함수를 불러내서
		if(isRange(a,b,c)&&dp[a][b][c]!=0) {
			return dp[a][b][c];
		}
		
		//그외에는 값 구하기
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		
		if(a < b && b < c) {
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		
		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	
	static boolean isRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
}

