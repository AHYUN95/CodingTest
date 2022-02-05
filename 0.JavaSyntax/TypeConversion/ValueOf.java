package TypeConversion;
/*
Ÿ��.valueOf(������) : �ش� �����͸� Ÿ������ ����ȯ 
String.valueOf(������) //���ڿ� ���·� ������(����,�Ǽ�)�� ����
Integer.valueOf(������) // ���� ���·� ������(���ڿ�)�� ����
						**���� �ش� �Լ��� �Ǽ�>������ ��ȯ ���� ����**
Double.valueOf(������) // �Ǽ� ���·� ������(���ڿ�,����)�� ����
 */

public class ValueOf {
	public static void main(String[] args) {
		
		String s = "10";
		int i = 20;
		double d = 30.0;
		
		System.out.println(String.valueOf(i)); //20
		System.out.println(String.valueOf(d)); //30.0
		System.out.println(Integer.valueOf(s));//10
		System.out.println(Double.valueOf(i)); //20.0
		System.out.println(Double.valueOf(s)); //10.0
	}

}
