package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCM_1934 {

	public static void main(String[] args) throws IOException {
	 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String [] s = br.readLine().split(" ");
			int first = Integer.parseInt(s[0]);
			int second = Integer.parseInt(s[1]);
			sb.append(gcm(first,second)+"\n");
		}
		System.out.println(sb);
	}
	
	
	static int gcm(int a, int b) {
		
		int result =0;
		int min = Math.min(a,b);
		for(int i=min; i>0; i--) {
			if(a%i==0 && b%i==0) {
				result = i;
				break;
			}
		}
		return result*(a/result)*(b/result);
	}
}
