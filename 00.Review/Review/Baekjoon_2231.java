package Review;

//BruteForce > decomposition_sum
//N=234 �� ���� ���� �����ڸ� ���س��� ���α׷�
public class Baekjoon_2231 {

	public static void main(String[] args) {

		
		int output = 0;
		int index = 234;
		
		while(index>0) {
			index --; //233���� ������ ���� Ȯ��
			
			int com =0;
			int index2 = index;
			
			/*<Review point>
			 ���� 
			 while(index>0) {
				com += index%10;
				index/=10;
			}
			index�� 0�� �Ǵ� ���� while���� �׸��� �ٱ� while�� ����..
			index�� 222�� ��쵵 ���ƾ� �ϴµ�..
			�׷��� index2��� ���� �����ؼ� �̰ɷ� while���� while�� ������.
			���� �����϶� �� Ȯ������~
			
			 */
			while(index2>0) {
				com += index2%10;
				index2/=10;
			}
			int total = com + index;
			
			if(total == 234) {//�������� 234�̸� �ش� index���� ������
				output = index;
			}
	}
		System.out.println(output);
}
}
