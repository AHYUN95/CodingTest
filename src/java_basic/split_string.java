package java_basic;

public class split_string {

	public static void main(String[] args) {
	//���ڿ� �ڸ���
	String str = "���,��,��,�ٳ���,����,����";
	String[] fruits = str.split(",");
	for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);

	
	
	}
	}
}
