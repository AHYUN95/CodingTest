package JavaSyntax;

public class Split {

	public static void main(String[] args) {
	
		//���ڿ� �ڸ���
		
		String str = "���,��,��,�ٳ���,����,����";
		String[] fruits = str.split(","); 
	
		//����(.)�� ��� ("\\.")���� ������� �Ѵ�.
	
		for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);

	
	
	}
	}
}
