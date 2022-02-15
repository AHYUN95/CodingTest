package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HappyFunction_9184 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int [][][] w = new int [21][21][21];
		//초기값 설정
		for(int i=0; i<21; i++) {
			for(int j=0; j<21;j++) {
			w[i][j][0] = 1;
			w[0][i][j] = 1;
			w[i][0][j] = 1;
			}
		}
		
		//값 넣어주기
		for(int i=1; i<21; i++) {
			for(int j=1; j<21;j++) {
				for(int k=1; k<21; k++) {
					if(i<j && j<k) {
						w[i][j][k] = w[i][j][k-1] + w[i][j-1][k-1] - w[i][j-1][k-1];
						} else
						w[i][j][k] = w[i-1][j][k]+w[i-1][j-1][k]+w[i-1][j][k-1]-w[i-1][j-1][k-1];
					}
				}
			}
		
		
		while(true) {
			String s = br.readLine();
			String [] str = s.split(" ");
		
			int n1 = Integer.valueOf(str[0]);
			int n2 = Integer.parseInt(str[1]);
			int n3 = Integer.parseInt(str[2]);
			
			if(n1==-1 && n2 == -1 && n3==-1) {
				break;	
			}
			
			if(n1<=0 || n2<=0 || n3<=0) {
				sb.append("w("+n1+", "+n2+", "+n3+") = 1"+"\n");
				}else if(n1>20 || n2>20 || n3>20) {
					sb.append("w("+n1+", "+n2+", "+n3+") = "+w[20][20][20]+"\n");
				}else {
					sb.append("w("+n1+", "+n2+", "+n3+") = "+w[n1][n2][n3]+"\n");
				}
			

		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}

