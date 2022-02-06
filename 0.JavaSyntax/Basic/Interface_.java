package Basic;

interface Animal2{	
	default public void cry() {
	System.out.println("짓기!");
	}
}

interface Dog2 extends Animal2 {	
	default public void cry() {
	System.out.println("멍멍!");
	}
}

interface Cat2 extends Animal2 {	
	default public void cry() {
	System.out.println("냐옹냐옹!");
	}
}

//다중상속을 인터페이스로 구현하면 Mypet에서만 cry() 함수를 정의
//인터페이스 dog2, cat2,를 상속받음
class Mypet implements Cat2,Dog2{
	public void cry() {
		System.out.println("멍멍!냐옹냐옹");
	}
}

public class Interface_ {

	public static void main(String[] args) {
		Mypet p = new Mypet();
		p.cry();

	}

}
