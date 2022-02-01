package Codeup_ProblemSet;
import java.util.Scanner;
public class code_0125_1010_1027 {
	
	//1010 정수 1개 입력 받아 그대로 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
		sc.close();
		
		
	//1011문자열 1개 입력받아 그대로 출력하기
		Scanner sc1 = new Scanner(System.in);
		char C = sc1.next().charAt(0);
	// scanner는 string으로 받음
	// string에서 char로 형 변환 charAt(몇번째숫자를)
		System.out.println(C);
		sc1.close();
		
		
	//1012실수1개 입력
		Scanner sc2 = new Scanner(System.in);
		float f = sc2.nextFloat();
		System.out.println(f);
		sc2.close();
		
		
	//1013 정수 2개 입력 받아 그대로 출력
		Scanner sc3 = new Scanner(System.in);
		int x = sc3.nextInt(); 
		int y = sc3.nextInt();
		System.out.printf("%d %d", x, y);
		sc3.close();
		
		
	//1014 A,B입력 B,A로 출력
		Scanner sc4 = new Scanner(System.in);
		char a = sc4.next().charAt(0);
		char b = sc4.next().charAt(0);
		System.out.printf("%c, %c", b, a);
		sc4.close();
		
		
	//1015
		Scanner sc5 = new Scanner(System.in);
		float f2 = sc5.nextFloat();
		System.out.printf("%.2f",f2);
		sc5.close();
		
		
	//1017
		Scanner sc6 = new Scanner(System.in);
		int i = sc6.nextInt();
		System.out.printf("%d %d %d", i, i, i);
		sc6.close();
		
		
	//1018 시간 입력
		Scanner sc7 = new Scanner(System.in);
		String c = sc7.nextLine();
		System.out.println(c);
		sc7.close();
		
		
	//1019 년월일 입력
		Scanner sc8 = new Scanner(System.in);
		String c0 = sc8.nextLine();
		String[] c2 = c0.split("\\."); //온점(.)split는 \\.
		System.out.printf("%02d.%02d.%02d", Integer.valueOf(c2[0]),Integer.valueOf(c2[1]),Integer.valueOf(c2[2]));
		sc8.close();
		
		
	//1019 정리해서 하기
		Scanner sc9 = new Scanner(System.in);
		String c02 = sc9.nextLine();
		String[] c29 = c02.split("\\."); //온점(.)split는 \\.
		
		int year = Integer.valueOf(c29[0]);
		int month = Integer.valueOf(c29[1]);
		int day = Integer.valueOf(c29[2]);
		
		System.out.printf("%02d.%02d.%02d", year, month,day);
		sc9.close();
		
		
	//1020
		Scanner sc20 = new Scanner(System.in);
		String per = sc20.nextLine();
		String[] num = per.split("-");
		System.out.printf("%s%s", num[0],num[1]);
		sc20.close();
		
		
	//1022
		Scanner sc21 = new Scanner(System.in);
		String word = sc21.nextLine();
		System.out.println(word);
		sc21.close();
	
		
	//1023 실수 찢기
		Scanner sc23 = new Scanner(System.in);
		float f23 = sc23.nextFloat();
		String[] f230 = String.valueOf(f23).split("\\.");
		sc23.close();
		
	//1023-1
		String front = f230[0];
		String Back = f230[1];
		
		System.out.println(front);
		System.out.println(Back);
	
	//1023-2
		System.out.printf("%s%n%s", f230[0], f230[1]);
	

		
	//1024 단어 1개 입력 받아서 한글자씨 나눠서 출력하기
		Scanner sc24 = new Scanner(System.in);
		String word24 = sc24.next();
		sc24.close();
		
		for (int i24 =0 ; i24 < word24.length(); i24++) {
			System.out.println("'"+word24.charAt(i24)+"'");}
	
		
	//1025 다섯자리의 정수 1개 입력 받고 각 자리별로 나누어 출력

		
	//1026 시:분:초 입력 분만 출력
		Scanner sc26 = new Scanner(System.in);
		String str26 = sc26.next();
		String[] time26 = str26.split(":");
		System.out.printf("%s",time26[1]);
		sc26.close();
	
	
	//1027
		Scanner sc27 = new Scanner(System.in);
		String str27 = sc27.next();
		String [] arr27 = str27.split("\\.");
		
		int year27 = Integer.valueOf(arr27[0]); 
		int month27 = Integer.valueOf(arr27[1]); 
		int day27 = Integer.valueOf(arr27[2]); 
		
		System.out.printf("%02d-%02d-%04d", day27, month27, year27);
		sc27.close();
	}
}
	