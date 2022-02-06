package Basic;

class Animal{
	public void cry() {
		System.out.println("짓기!");
	}
}
//Cat은 Animal을 상속받음
class Cat extends Animal{
	@Override 
	//부모에게 물려받은 자원 변형할때 override
	public void cry() {
		System.out.println("냐옹냐옹!");
	}
}

class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
}
/*
 >> 다중 상속을 받으면 cry함수에 대한 모호성이 발생하게 돤다.
 >> 그래서 인터페이스를 통해서 구현을 해야한다.
class Mypet extends Cat,Dog {}


public class Interface_test {
	public static void main(String[] args) {
		Mypet p = new Mypet();
		p.cry() >> Cat의 cry쓸지 Dog의 cry쓸지 모호하다.

	}

}

*/
