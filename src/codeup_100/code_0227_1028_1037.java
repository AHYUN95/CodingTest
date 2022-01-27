package codeup_100;
import java.util.Scanner;

public class code_0227_1028_1037 {
	public static void main(String[] args) {
		
		//1028 정수 입력 받아 출력
		Scanner sc28 = new Scanner(System.in);
		int ip28 = sc28.nextInt();
		System.out.printf("%d", ip28);
		sc28.close();
		
		//1029 실수 입력 받아 출력
		Scanner sc29 = new Scanner(System.in);
		float ip29 = sc28.nextFloat();
		System.out.printf("%f", ip29);
		sc29.close();
		
		//1031 출력변환 10진수로 받아서 8진수로 출력
		Scanner sc31 = new Scanner(System.in);
		int ip31 = sc31.nextInt();
		System.out.printf("%o",ip31);
		sc31.close();
		
		//1032, 1033 10진수 이력 16진수 출력
		Scanner sc32 = new Scanner(System.in);
		int ip32 = sc32.nextInt();
		System.out.printf("%x",ip32); //소문자 %x
		System.out.printf("%X",ip32); //대문자 %X
		sc32.close();
		
		//1034 8진수로 입력 받아서 10진수로 바꾸어 출력
		Scanner sc34 = new Scanner(System.in);
		String str34 =sc34.nextLine();
		int int34 = Integer.parseInt(str34, 8);
		System.out.println(int34);
		sc34.close();
		
		//1035 16진수 입력 받아서 8진수로 출력하기
		Scanner sc35 = new Scanner(System.in);
		String str35 = sc35.nextLine();
		int num35 = Integer.parseInt(str35,16);
		String eit35 = Integer.toOctalString(num35);
		System.out.println(eit35);
		sc35.close();
		
		//1036 영문자 1개 입력 받아서 10진수로 출력하기
		Scanner sc36 = new Scanner(System.in);
		char c = sc36.next().charAt(0);
		System.out.println((int)c);
		sc36.close();
		
		//1037 숫자 입력 받아 아스키코드 변환
		Scanner sc37 = new Scanner(System.in);
		int num37 = sc37.nextInt();
		System.out.println((char)num37);
		sc37.close();
		
	}
	
	

}
