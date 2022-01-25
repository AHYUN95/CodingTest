package java_basic;

public class split_string {

	public static void main(String[] args) {
	//문자열 자르기
	String str = "사과,배,귤,바나나,딸기,수박";
	String[] fruits = str.split(",");
	for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);

	
	
	}
	}
}
