package Basic;

interface Animal2{	
	default public void cry() {
	System.out.println("����!");
	}
}

interface Dog2 extends Animal2 {	
	default public void cry() {
	System.out.println("�۸�!");
	}
}

interface Cat2 extends Animal2 {	
	default public void cry() {
	System.out.println("�Ŀ˳Ŀ�!");
	}
}

//���߻���� �������̽��� �����ϸ� Mypet������ cry() �Լ��� ����
//�������̽� dog2, cat2,�� ��ӹ���
class Mypet implements Cat2,Dog2{
	public void cry() {
		System.out.println("�۸�!�Ŀ˳Ŀ�");
	}
}

public class Interface_ {

	public static void main(String[] args) {
		Mypet p = new Mypet();
		p.cry();

	}

}
