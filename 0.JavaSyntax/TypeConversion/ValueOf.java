package TypeConversion;
/*
타입.valueOf(데이터) : 해당 데이터를 타입으로 형변환 
String.valueOf(데이터) //문자열 형태로 데이터(정수,실수)가 저장
Integer.valueOf(데이터) // 정수 형태로 데이터(문자열)가 저장
						**주의 해당 함수는 실수>정수로 변환 지원 안함**
Double.valueOf(데이터) // 실수 형태로 데이터(문자열,정수)가 저장
 */

public class ValueOf {
	public static void main(String[] args) {
		
		String s = "10";
		int i = 20;
		double d = 30.0;
		
		System.out.println(String.valueOf(i)); //20
		System.out.println(String.valueOf(d)); //30.0
		System.out.println(Integer.valueOf(s));//10
		System.out.println(Double.valueOf(i)); //20.0
		System.out.println(Double.valueOf(s)); //10.0
	}

}
