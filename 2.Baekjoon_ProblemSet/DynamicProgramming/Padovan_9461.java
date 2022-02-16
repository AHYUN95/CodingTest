package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padovan_9461 {

static long [] parr;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		parr = new long [101];
		
		//이렇게 초기화를 주는거나 아래 36-40처럼 조건으로 주는거나 메모리 시간 비슷..
		parr[1]=1;
		parr[2]=1;
		parr[3]=1;
		parr[4]=2;
		parr[5]=2;
		
		for(int i=0; i<N; i++) {
			int tCase = Integer.parseInt(br.readLine());
			sb.append(P(tCase)+"\n");
		}
		System.out.println(sb);
	}
	
	static long P(int n) {
		if(parr[n]!=0) {
			return parr[n];
		}
		/*
		if(n<=3) {
			return parr[n] = 1;
		}else if(n==4||n==5) {
			return parr[n] = 2;
		}else
		*/
			return parr[n] = P(n-2)+P(n-3);
	}
}
