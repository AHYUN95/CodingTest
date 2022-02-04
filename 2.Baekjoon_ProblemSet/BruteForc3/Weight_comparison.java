package BruteForc3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Weight_comparison {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] input = new String[N]; //N개의 몸무게 키 세트를 받을꺼임
		
		for(int i=0; i<N; i++) { 
			input [i] = br.readLine();
			}
		
		// 인제 비교
		int [] count = new int [N];	//등수 넣어줄꺼임
		for(int i=0; i<N; i++) {
			count[i] = 1;
		}							//배열 초기화
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
			String com1 = input[i];
			String com2 = input[j];
			String [] c1 = com1.split(" ");
			String [] c2 = com2.split(" ");
			
			int x1 = Integer.parseInt(c1[0]);
			int y1 = Integer.parseInt(c1[1]);
			
			int x2 = Integer.parseInt(c2[0]);
			int y2 = Integer.parseInt(c2[1]);	//비교할 두개의 값 정리
			
			if(x1<x2 && y1<y2)
				count[i]++;	//i(x1,y1)이 덩치가 작으면 값 하나 더해줌 
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(count[i]+" ");
		}
		System.out.println(sb);
	}
}
