package Conditional;

public class TernaryOperator {

	public static void main(String[] args) {
		// if-else표현
		int c;
		int a = 5;
		int b = 4;
		if (a<b) {
			c=50;
		}else {
			c=40;}
		
		System.out.println(c); // 결과 = 40
		
		//삼항연산자 표현
		// 조건식?(참일때의 값): (거짓일떄의 값)ㄴ
		int d = (a<b)? 50 :40;
		System.out.println(d); // 결과 = 40
		
		//3개 비교
		//(a>b ? a:b)>c ? (a>b ? a:b):c
	
	
	}
	

	}


