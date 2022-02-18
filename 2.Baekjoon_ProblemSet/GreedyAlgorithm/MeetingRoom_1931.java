package GreedyAlgorithm;
/* 
Ȱ�� ���� ����(Activity Selection problem) 
>> �� ����� �ϳ��� Ȱ���� ���ؼ��� �۾��� �� ���� �� �ִ��� ���� Ȱ������ �� �� �ִ� ���� ����
 */

// ���� ��ġ�� �ʴ� Ȱ������ ����ð��� ������ �� ���� Ȱ���� ������ �� ����.
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
		
		//������ ������ tarr ���� ����
		Arrays.sort(tarr, new Comparator<int []> () {
					@Override
			public int compare(int[] n1, int[] n2) {
					if(n1[1]==n2[1]) //������ �ð� ������ �����ϴ� �ð� ���� ������
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
