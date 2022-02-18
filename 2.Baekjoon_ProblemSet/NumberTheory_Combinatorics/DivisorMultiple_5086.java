package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorMultiple_5086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String [] s = br.readLine().split(" ");
			int arr [] = new int [2];
			arr[0] = Integer.parseInt(s[0]);
			arr[1] = Integer.parseInt(s[1]);
			if(arr[0]==0 && arr[1]==0) {
				break;
			}
			
			if(arr[1]%arr[0]==0){
				sb.append("factor"+"\n");
			}else if(arr[0]%arr[1]==0) {
				sb.append("multiple"+"\n");
			}else {
				sb.append("neither"+"\n");
			}
		}
		
		System.out.println(sb);
	}

}
