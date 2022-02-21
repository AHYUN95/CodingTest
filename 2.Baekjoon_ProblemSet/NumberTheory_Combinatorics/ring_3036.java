package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ring_3036 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String [] s = br.readLine().split(" ");		
		int [] r = new int [N];
		for(int i=0; i<N; i++) {
			r[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=1;i<N; i++) {
			int gcd = GCD(r[0],r[i]);
			sb.append(r[0]/gcd+"/"+r[i]/gcd+"\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
		
	}
	//최대공약수 
	static int GCD(int a, int b) {
		int r;
		while(b!=0) {
			r= a % b ;
			a = b ;
			b = r ;
		}
		return a;
	}
}