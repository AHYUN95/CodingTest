package Basic;

interface Animal2{	
	default public void cry() {
	System.out.println("Áş±â!");
	}
}

interface Dog2 extends Animal2 {	
	default public void cry() {
	System.out.println("¸Û¸Û!");
	}
}

interface Cat2 extends Animal2 {	
	default public void cry() {
	System.out.println("³Ä¿Ë³Ä¿Ë!");
	}
}

//´ÙÁß»ó¼ÓÀ» ÀÎÅÍÆäÀÌ½º·Î ±¸ÇöÇÏ¸é Mypet¿¡¼­¸¸ cry() ÇÔ¼ö¸¦ Á¤ÀÇ
class Mypet implements Cat2,Dog2{
	public void cry() {
		System.out.println("¸Û¸Û!³Ä¿Ë³Ä¿Ë");
	}
}

public class Interface_ {

	public static void main(String[] args) {
		Mypet p = new Mypet();
		p.cry();

	}

}
