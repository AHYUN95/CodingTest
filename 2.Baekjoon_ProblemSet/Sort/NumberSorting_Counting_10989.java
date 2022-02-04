package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/*카운팅 정렬
 https://lordofkangs.tistory.com/137?category=877568
 인덱스를 input범위 최댓값+1로 해서 인덱스값이랑 동일하면 1씩증가
 그 후에 1부터 출력해주기
*/
public class NumberSorting_Counting_10989 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//이 수는 10,000보다 작거나 같은 자연수이다
		int [] count = new int [10001];
		
		//받은 수에 맞은 인덱스 값 +1씩해준다.
		for(int i=0; i<N; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}
	
		//출력
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(count[i]>0) {	//입력 받아서 값이 플러스 되어 있으면
				for(int j=0; j<count[i]; j++) {//count된 만큼 i숫자(인덱스)를 출력
					sb.append(i +"\n");
				}
			}
		}
		System.out.println(sb);
	}

}
