package Conditional;

public class While_true {

	public static void main(String[] args) {
		/*���ѷ��� 
		while(true){
		��� �����Ұ�
			if(���� ����){
			break;}
				}
		*/
		int i =1;
		int sum =0;
		while(true) {			
				sum += i;
				i++; 				//if ���� ���������� ���
				if (sum >= 100) {
					break; 			// ������ ������ ���� break!
				}
		}

		/*
		for(int i=n; i>0; i--) ����
		while(t-->0)
		 * 
		 */
	}

}