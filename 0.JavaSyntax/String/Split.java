package String;

public class Split {

	public static void main(String[] args) {
	
		//���ڿ�(String) �ڸ���
		
		String str = "���,��,��,�ٳ���,����,����";
		String[] fruits = str.split(","); 
	
		//����(.)�� ��� ("\\.")���� ������� �Ѵ�.
	
		for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);
		}	
		
		String str2 = "����Դϴ�";
		String[] fruits2 = str2.split("");
		
		// split("")�ϳ��� ������
		
		for(int i2 = 0; i2<fruits2.length;i2++) {
			System.out.println(fruits2[i2]);
			}
	
		//�����ڰ� 2�� �� ��� | �� ���ؼ� ����
		// Ư�� ������ ��� \\Ư������ �̷��� ����� �Ѵ�. 
		String str3 = "1+2+3-4";
		String [] s3 = str3.split("\\+|\\-");
		for(int i = 0; i<s3.length;i++) {
			System.out.println(s3[i]);
			}
	}
}
