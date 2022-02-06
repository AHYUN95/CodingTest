package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//선택정렬로 푸는 경우 시간초과 발생
public class CoordinateSorting_11650_TimeOver {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int [][] iarr = new int [N][2]; 
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split(" ");
			iarr[i][0] = Integer.parseInt(str[0]);
			iarr[i][1] = Integer.parseInt(str[1]);
		}
		
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
			if(iarr[i][0]>iarr[j][0]) {
				
				int temp=iarr[i][0];
				iarr[i][0] = iarr[j][0];
				iarr[j][0] = temp;
				
				int temp2 = iarr[i][1];
				iarr[i][1] = iarr[j][1];
				iarr[j][1] = temp2;
				     
				
			}else if (iarr[i][0]==iarr[j][0] && iarr[i][1]>iarr[j][1]){
				
				int temp=iarr[i][0];
				iarr[i][0] = iarr[j][0]; 
				iarr[j][0] = temp;
				
				int temp2 = iarr[i][1];
				iarr[i][1] = iarr[j][1];
				iarr[j][1] = temp2;
				}			
			}
		}                           
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<N; i++) {
			sb.append(iarr[i][0]+" "+iarr[i][1]+"\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
}
