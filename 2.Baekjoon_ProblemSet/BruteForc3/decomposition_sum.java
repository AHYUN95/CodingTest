package BruteForc3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decomposition_sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int output = 0;
		int index = n; // index: Ȯ���� ��
		
		while(index>0) {
			index --; //n-1���� ������ ���� Ȯ��
			
			int com =0;		//���ڸ��� ��
			int index2 = index; // while���� �� ���� index�� ������ index���� ����
			while(index2>0) {
				com += index2%10;
				index2/=10;
			}
			int total = com + index;	//������
			
			if(total == n) {
				output = index;//n�� �ϳ��� �پ��鼭 ���� �����
			}
	}
		System.out.println(output);
		br.close();
}
}
