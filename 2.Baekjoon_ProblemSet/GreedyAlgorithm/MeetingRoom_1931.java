package GreedyAlgorithm;
/* 
활동 선택 문제(Activity Selection problem) 
>> 한 사람이 하나의 활동에 대해서만 작업할 수 있을 때 최대한 많은 활동ㅇ르 할 수 있는 수를 선택
 */

// 서로 겹치지 않는 활동에서 종료시간이 빠르면 더 많은 활동을 선택할 수 있음.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom_1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int tarr [][] = new int [N][2];
		
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split(" ");{
			tarr[i][0] = Integer.parseInt(str[0]);
			tarr[i][1] = Integer.parseInt(str[1]);
			}
		}
		
		//끝나는 순으로 tarr 오름 차순
		Arrays.sort(tarr, new Comparator<int []> () {
					@Override
			public int compare(int[] n1, int[] n2) {
					if(n1[1]==n2[1]) //끝나는 시간 같으면 시작하는 시간 빠른 순으로
						return n1[0] - n2[0];
					else
						return n1[1]-n2[1];
					}
		});
		
		int count = 0;
		int ftime = 0;
		
		for(int i=0; i<N; i++) {
			if(tarr[i][0]>=ftime) {
				count++;
				ftime = tarr[i][1];
			}
		}
		System.out.println(count);
	}
}
