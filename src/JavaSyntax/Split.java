package JavaSyntax;

public class Split {

	public static void main(String[] args) {
	
		//문자열 자르기
		
		String str = "사과,배,귤,바나나,딸기,수박";
		String[] fruits = str.split(","); 
	
		//온점(.)의 경우 ("\\.")으로 적어줘야 한다.
	
		for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);

	
	
	}
	}
}
