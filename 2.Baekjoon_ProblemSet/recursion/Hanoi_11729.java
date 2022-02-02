package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi_11729 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(hanoiNum(n));
		hanoiM(n,1,2,3);

	}
	//n = 하노이 몇층, from= 시작 칸, to = 도착지, by = 나머지
	static void hanoiM(int n, int from, int by, int to) {
		
		if (n==1) {
			System.out.printf("%d %d%n", from,to);
		}else {
			hanoiM(n-1,from,to,by);
			System.out.printf("%d %d%n", from,to);
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

