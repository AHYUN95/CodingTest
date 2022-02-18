package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GasStation_13305 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String distance [] = br.readLine().split(" ");
		String cost [] = br.readLine().split(" ");
		
		long d [] = new long [N-1];
		long c [] = new long [N];
		
		for(int i=0; i<N-1; i++) {
			d[i] = Long.parseLong(distance[i]);
		}
		for(int i=0; i<N; i++) {
			c[i] = Long.parseLong(cost[i]);
		}
   
		long sum =c[0]*d[0];
		long mincost = c[0];
		
		for(int i=1; i<=N-2; i++) {
			if(mincost<=c[i]) {
				sum += mincost*d[i];
			}else{
				sum+= c[i]*d[i];
				mincost = c[i];
			}	
			}
		System.out.println(sum);
	}
}
