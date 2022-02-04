package BruteForc3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Weight_comparison {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] input = new String[N]; //N���� ������ Ű ��Ʈ�� ��������
		
		for(int i=0; i<N; i++) { 
			input [i] = br.readLine();
			}
		
		// ���� ��
		int [] count = new int [N];	//��� �־��ٲ���
		for(int i=0; i<N; i++) {
			count[i] = 1;
		}							//�迭 �ʱ�ȭ
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
			String com1 = input[i];
			String com2 = input[j];
			String [] c1 = com1.split(" ");
			String [] c2 = com2.split(" ");
			
			int x1 = Integer.parseInt(c1[0]);
			int y1 = Integer.parseInt(c1[1]);
			
			int x2 = Integer.parseInt(c2[0]);
			int y2 = Integer.parseInt(c2[1]);	//���� �ΰ��� �� ����
			
			if(x1<x2 && y1<y2)
				count[i]++;	//i(x1,y1)�� ��ġ�� ������ �� �ϳ� ������ 
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(count[i]+" ");
		}
		System.out.println(sb);
	}
}
