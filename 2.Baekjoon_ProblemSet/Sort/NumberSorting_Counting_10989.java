package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/*ī���� ����
 https://lordofkangs.tistory.com/137?category=877568
 �ε����� input���� �ִ�+1�� �ؼ� �ε������̶� �����ϸ� 1������
 �� �Ŀ� 1���� ������ֱ�
*/
public class NumberSorting_Counting_10989 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//�� ���� 10,000���� �۰ų� ���� �ڿ����̴�
		int [] count = new int [10001];
		
		//���� ���� ���� �ε��� �� +1�����ش�.
		for(int i=0; i<N; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}
	
		//���
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(count[i]>0) {	//�Է� �޾Ƽ� ���� �÷��� �Ǿ� ������
				for(int j=0; j<count[i]; j++) {//count�� ��ŭ i����(�ε���)�� ���
					sb.append(i +"\n");
				}
			}
		}
		System.out.println(sb);
	}

}
