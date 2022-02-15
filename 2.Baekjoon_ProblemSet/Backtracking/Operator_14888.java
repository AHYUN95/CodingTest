package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Operator_14888 {
	
	static int N;
	static int [] number;
	static int [] operator = new int [4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		String [] inputNum = br.readLine().split(" ");
		number = new int [N];
		for(int i=0; i<N; i++) {
			number[i] = Integer.parseInt(inputNum[i]);
		}
		
		String [] inputop= br.readLine().split(" ");
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(inputop[i]);
		}
		
		dfs(number[0],1);
		
		bw.write(MAX+"\n"+MIN);
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void dfs (int num, int idx) {
		if(idx==N) {//idx가 N-1개 까지 연산자 사용해주고, N이 되면 멈춤
						
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			
			return;
		}
			
		for(int i=0; i<4; i++) {
			if(operator[i]>0) {
				operator[i]--;
				
				switch(i) {
				
				case 0 : dfs(num + number[idx], idx+1); break;
				case 1 : dfs(num - number[idx], idx+1); break;
				case 2 : dfs(num * number[idx], idx+1); break;
				case 3 : dfs(num / number[idx], idx+1); break;
				}
				//idx==N인 경우 재귀함수 종료, 다시 연산자 개수 되돌리기
				operator[i]++;
			}
		}
	}

}
