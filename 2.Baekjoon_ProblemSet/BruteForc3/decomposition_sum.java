package BruteForc3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decomposition_sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int output = 0;
		int index = n; // index: 확인할 값
		
		while(index>0) {
			index --; //n-1부터 생성자 인지 확인
			
			int com =0;		//각자릿수 합
			int index2 = index; // while돌릴 값 설정 index로 돌리면 index값이 변경
			while(index2>0) {
				com += index2%10;
				index2/=10;
			}
			int total = com + index;	//분해합
			
			if(total == n) {
				output = index;//n이 하나씩 줄어들면서 값을 덮어씌움
			}
	}
		System.out.println(output);
		br.close();
}
}
