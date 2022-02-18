package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class check_2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdval = arr[1]-arr[0];
		
		for(int i=2; i<N; i++) {
			gcdval = gcd(gcdval,arr[i]-arr[i-1]);
		}
		
		//최소 공약수 약수 구하기
		for(int i=2; i<=gcdval;i++) {
			if(gcdval%i==0) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
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
