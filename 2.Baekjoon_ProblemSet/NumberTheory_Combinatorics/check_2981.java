package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check_2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
	}
		
	//최대공약수, 유클리드 호제법
		static int gcd(int a, int b) {
			while(b!=0) {
				int r = a%b;
				a = b;
				b = r;
			}
			return a;
		}
		

}
