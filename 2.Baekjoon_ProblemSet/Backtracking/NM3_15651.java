package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NM3_15651 {
static int N;
static int M;
static int iarr [];
static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		iarr = new int [M];
		
		NM(0);
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void NM(int depth) {
		//끝낼 조건
		if(depth==M) {
		for(int val : iarr) {
			sb.append(val+" ");
			}sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			iarr[depth] = i+1;
			NM(depth+1);
		}
	}
	}