package String;

public class Split {

	public static void main(String[] args) {
	
		//문자열(String) 자르기
		
		String str = "사과,배,귤,바나나,딸기,수박";
		String[] fruits = str.split(","); 
	
		//온점(.)의 경우 ("\\.")으로 적어줘야 한다.
	
		for(int i = 0; i<fruits.length;i++) {
		System.out.println("fruits["+i+"]="+fruits[i]);
		}	
		
		String str2 = "사과입니다";
		String[] fruits2 = str2.split("");
		
		// split("")하나씩 나눠짐
		
		for(int i2 = 0; i2<fruits2.length;i2++) {
			System.out.println(fruits2[i2]);
			}
	
		//구분자가 2개 일 경우 | 를 통해서 구분
		// 특수 문자의 경우 \\특수문자 이렇게 써줘야 한다. 
		String str3 = "1+2+3-4";
		String [] s3 = str3.split("\\+|\\-");
		for(int i = 0; i<s3.length;i++) {
			System.out.println(s3[i]);
			}
	}
}
