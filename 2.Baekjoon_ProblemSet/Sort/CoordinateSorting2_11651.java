package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class CoordinateSorting2_11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int [][] iarr = new int [N][2];
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split(" ");
			iarr[i][0] = Integer.parseInt(str[0]);
			iarr[i][1] = Integer.parseInt(str[1]);
		}
		
		
		Arrays.sort(iarr, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1])
					return o1[0]-o2[0];  //양수인경우 o1이 더 크다고 출력
				else
					return o1[1]-o2[1];
			}
		});
		
		for(int i=0; i<N; i++) {
			sb.append(iarr[i][0]+" "+iarr[i][1]+"\n");
		}
	
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();		
	}

}
