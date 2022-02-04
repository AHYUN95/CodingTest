package Codeup_ProblemSet;
import java.util.Scanner;

public class code_0130_1071_1077 {

	//1071 0 입력될때 까지 무한 출력하기
	public static void main1071(String[] args) {
		
	Scanner sc71 = new Scanner(System.in);
	String[] str71 = sc71.nextLine().split(" ");
	sc71.close();
	
	for (String result71 : str71) {
		if(result71.equals("0")) {
			break;
		}
		System.out.println(result71);
	}

	}
	
	//1072 정수 입력 받아 계속 출력하기
	public static void main1072(String[] args) {
		
	Scanner sc72 = new Scanner(System.in);
	//int num72 = sc72.nextInt();
	sc72.nextLine(); //nextInt의 엔터가 nextLine에 들어가있어서 삭제
	String [] str72 = sc72.nextLine().split(" ");
	sc72.close();
	
	for(String result72 : str72) {
		System.out.println(result72);
	}
	}
	
	//1074 카운트 다운 5 > 5 4 3 2 1 
	public static void main1074(String[] args) {
		
	Scanner sc74 = new Scanner (System.in);
	int num74 = sc74.nextInt();
	sc74.close();
	
	while(num74 > 0) {
		System.out.print(num74--); //후치연산
	}
}
	
	//1075 카운트 다운 5 > 4 3 2 1 0
	public static void main1075(String[] args) {
		
	Scanner sc75 = new Scanner(System.in);
	int num75 = sc75.nextInt();
	sc75.close();
	while(num75 >0) {
		System.out.println(--num75);
		}
	}
	
	//1076 숫자대로 출력 c > a b c
	public static void main1076(String[] args) {
	
	Scanner sc76 = new Scanner(System.in);
	char c76 = sc76.next().charAt(0);
	sc76.close();
	for (char i = 'a'; i <= c76; i++) {
		System.out.println(i);
	}
	}
	
	//1077 0부터 입력 받아 숫자 까지
	public static void main1077(String[] args) {
	
	Scanner sc77 = new Scanner(System.in);
	int num77 = sc77.nextInt();
	sc77.close();
	
	for (int i=0 ; i <=num77; i++) {
		System.out.println(i);
	}
		
	}
	
	}

