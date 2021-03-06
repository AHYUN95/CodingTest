package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NM2_15650 {

static int N;
static int M;
static StringBuilder sb = new StringBuilder();
static int [] iarr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		iarr = new int [M]; // 수열 몇개를 담을 지, depth
		
		NM(0,0);
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
		
		public static void NM(int start, int depth) {
			if(depth == M) {
				for(int val : iarr) {
				sb.append(val+" ");
				} sb.append("\n");
					return;//재귀함수 끝내준다.
			}
			for(int i=start; i<N; i++) {
				iarr[depth] =i+1;
				NM(i+1,depth+1);
				
			}
			
		}

}


