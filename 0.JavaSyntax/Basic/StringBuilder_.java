package Basic;

public class StringBuilder_ {
	
	public static void main(String[] args) {
	for(int i=0; i<=10; i++) {
		System.out.println("Hello"); // �ð� �ʹ� ���� ���Ե�
	}//�Ź� �ٷ� ���
		
	StringBuilder sb = new StringBuilder(); // StringBuilder ������
	for(int i=0;i<=10; i++) {
	sb.append("Hello2\n");
	}	
	
	System.out.println(sb);
	/*
	* ��Ƽ� �ѹ��� ���, �ݺ��ؼ� ����ؾ� �ϴ� ���� StringBuilder���
	*sb.toString() ���� �ʾƵ� ��� ����� ������ ������ StringBuilder��ü��
	*toString�� �������̵� �Ǿ��ֱ� ����
	*/
		
	}
	}


