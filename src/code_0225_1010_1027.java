import java.util.Scanner;
public class code_0225_1010_1027 {
	//1010 정수 1개 입력 받아 그대로 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	
	//1011문자열 1개 입력받아 그대로 출력하기
		Scanner sc1 = new Scanner(System.in);
		char C = sc1.next().charAt(0); 
	// scanner는 string으로 받음
	// string에서 char로 형 변환 charAt(몇번째숫자를)
		System.out.println(C);
	
	//1012실수1개 입력
		Scanner sc2 = new Scanner(System.in);
		float f = sc2.nextFloat();
		System.out.println(f);
		
	//1013 정수 2개 입력 받아 그대로 출력
		Scanner sc3 = new Scanner(System.in);
		int x = sc3.nextInt(); 
		int y = sc3.nextInt();
		System.out.printf("%d %d", x, y);
	
	//1014 A,B입력 B,A로 출력
		Scanner sc4 = new Scanner(System.in);
		char a = sc4.next().charAt(0);
		char b = sc4.next().charAt(0);
		System.out.printf("%c, %c", b, a);
	
	//1015
		Scanner sc5 = new Scanner(System.in);
		float f2 = sc5.nextFloat();
		System.out.printf("%.2f",f2);
	
	//1017
		Scanner sc6 = new Scanner(System.in);
		int i = sc6.nextInt();
		System.out.printf("%d %d %d", i, i, i);
	
	//1018 시간 입력
		Scanner sc7 = new Scanner(System.in);
		String c = sc7.nextLine();
		System.out.println(c);
	
	//1019 년월일 입력
		Scanner sc8 = new Scanner(System.in);
		String c0 = sc8.nextLine();
		String[] c2 = c0.split("\\."); //온점(.)split는 \\.
		System.out.printf("%02d.%02d.%02d", Integer.valueOf(c2[0]),Integer.valueOf(c2[1]),Integer.valueOf(c2[2]));

	//1019
		Scanner sc9 = new Scanner(System.in);
		String c02 = sc9.nextLine();
		String[] c29 = c02.split("\\."); //온점(.)split는 \\.
		
		int year = Integer.valueOf(c29[0]);
		int month = Integer.valueOf(c29[1]);
		int day = Integer.valueOf(c29[2]);
		
		System.out.printf("%02d.%02d.%02d", year, month,day);
	
	//1020
		Scanner sc20 = new Scanner(System.in);
		String per = sc20.nextLine();
		String[] num = per.split("-");
		System.out.printf("%s%s", num[0],num[1]);
		
		
		
		
		
		
	}
}
