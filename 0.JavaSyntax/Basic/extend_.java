package Basic;

class Animal{
	public void cry() {
		System.out.println("����!");
	}
}
//Cat�� Animal�� ��ӹ���
class Cat extends Animal{
	@Override 
	//�θ𿡰� �������� �ڿ� �����Ҷ� override
	public void cry() {
		System.out.println("�Ŀ˳Ŀ�!");
	}
}

class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("�۸�!");
	}
}
/*
 >> ���� ����� ������ cry�Լ��� ���� ��ȣ���� �߻��ϰ� �ô�.
 >> �׷��� �������̽��� ���ؼ� ������ �ؾ��Ѵ�.
class Mypet extends Cat,Dog {}


public class Interface_test {
	public static void main(String[] args) {
		Mypet p = new Mypet();
		p.cry() >> Cat�� cry���� Dog�� cry���� ��ȣ�ϴ�.

	}

}

*/
