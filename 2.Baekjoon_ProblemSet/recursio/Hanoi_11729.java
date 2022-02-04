package recursio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi_11729 {

	static StringBuilder sb;
	
	public static void main(String[] args)throws IOException {
		sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoiM(n,1,2,3);
		System.out.println(hanoiNum(n));
		System.out.println(sb.toString());

	}
	
	//n = 하노이 몇층, from= 시작 칸, to = 도착지, by = 나머지
	static void hanoiM(int n, int from, int by, int to) {
		
		if (n==1) {
			sb.append(from+" "+to+"\n");
			//System.out.printf("%d %d%n", from,to);
		}else {
			hanoiM(n-1,from,to,by);
			//System.out.printf("%d %d%n", from,to);
			sb.append(from+" "+to+"\n");
			hanoiM(n-1,by,from,to);
		}
	}
	
	static int hanoiNum(int n) {
		if(n==1)
			return 1;
		else
			return hanoiNum(n-1)*2 + 1;
	}
}

