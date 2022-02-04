package InputOutput;
import java.util.Scanner;

public class printf {

	public static void main(String[] args) {
		//printf 서식문자
		Scanner printf = new Scanner(System.in);
		int tPrintf = printf.nextInt();
		System.out.printf("%d%n", tPrintf); //10진수
		System.out.printf("%o%n", tPrintf); //8진수
		System.out.printf("%x%n", tPrintf); //16진수
		
		//자릿수 채워주기 ex)12입력
		System.out.printf("%3d%n", tPrintf); // 공백12 출력
		System.out.printf("%03d%n", tPrintf); // 012 출력
		
		//소숫점 자리 잘라주기 %.nf n번째 소수점 까지 잘라준다.
		System.out.printf("%.3f", tPrintf); //3번째자리수까지
		
		//특수 문자
		System.out.println("안녕|t하세요"); // 안녕	하세요
		System.out.println("안녕|n하세요");// 줄띄움
		System.out.println("안녕|'하세요|'"); //안녕'하세요'
		System.out.println("안녕||하세요||"); //안녕\하세요\
		
		printf.close();
	}

	
}
