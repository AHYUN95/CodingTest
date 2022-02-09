package Sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class CoordinateSorting_11650_Comparator {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		//입력 받은 좌표 넣어주기
		int [][] iarr = new int [n][2]; 
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			iarr[i][0] = Integer.parseInt(str[0]);
			iarr[i][1] = Integer.parseInt(str[1]);
		}
		
		
		Arrays.sort(iarr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];		//인덱스0가 같다면 인덱스1값 비교 
				}else {
					return o1[0] -o2[0];
				}
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<n; i++) {
			sb.append(iarr[i][0]+" "+iarr[i][1]+"\n");
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
		
	}

}
