package Strings;

public class StringBuilder_ {
	
	public static void main(String[] args) {
	for(int i=0; i<=10; i++) {
		System.out.println("Hello"); // �ð� �ʹ� ���� ���Ե�
	}//�Ź� �ٷ� ���
		
	StringBuilder sb = new StringBuilder(); // StringBuilder ������
	for(int i=0;i<=10; i++) {
	int k =3;
	sb.append(k+"\n");
	int [] arr =new int [1];
	arr[0] =2;
	sb.append(arr[0]+"\n");
	}	
	
	System.out.println(sb);
	/*
	* ��Ƽ� �ѹ��� ���, �ݺ��ؼ� ����ؾ� �ϴ� ���� StringBuilder���
	*sb.toString() ���� �ʾƵ� ��� ����� ������ ������ StringBuilder��ü��
	*toString�� �������̵� �Ǿ��ֱ� ����
	*++���ٶ��̵� �Ǿ int, arr, char�� ��� ������
	*/
		
	}
	}


