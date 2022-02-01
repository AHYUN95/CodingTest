package Codeup_ProblemSet;
import java.util.Scanner;
public class code_0127_1038_1046 {

	public static void main(String[] args) {
	// 1038 합 구하기
	Scanner sc38 = new Scanner(System.in);
	int sum1 = sc38.nextInt();
	int sum2 = sc38.nextInt();
	sc38.close();
	
	long sumResult = sum1 + sum2;
	System.out.print(sumResult);
	
	//1040
	Scanner sc40 = new Scanner(System.in);
	int num40 = sc40.nextInt();
	System.out.println(-num40);
	sc40.close();
	
	//1041 다음 영문자 입력하기
	Scanner sc41 = new Scanner(System.in);
	int num41 = (int)sc41.next().charAt(0);
	int result41 = num41+1;
	System.out.print((char)result41);
	sc41.close();
	}
	
	//문자도 바로 더하기 가능
	Scanner sc41_2 = new Scanner (System.in);
	char c41_2 = sc41_2.next().charAt(0);
	char nextchar = (char)(c41_2+1);
	
	//1042 나누기  1043나머지값 %
	Scanner sc42 = new Scanner (System.in);
	String str42 = sc42.nextLine();
	String[] di42 = str42.split(" ");
	int div1 = Integer.parseInt(di42[0]);
	int div2 = Integer.parseInt(di42[1]);
	int div = (div1 /div2 );
	
	//1044
	Scanner sc44 = new Scanner(System.in);
	long num44 = sc44.nextLong();
	// System.out.println(num44+1);
	
	//1045
	Scanner sc45 = new Scanner (System.in);
	String str45 = sc45.nextLine();
	String[] input45 = str45.split(" ");
	int numf = Integer.parseInt(input45[0]);
	int nums = Integer.parseInt(input45[1]);
   
	int sum45 = numf+nums;
	int diff45 = numf-nums;
	long prod45 = numf*nums;
	int quotient45 = numf/nums;
	int remain45 = numf%nums;
	double divi45 = (double)numf/nums;
	
	//System.out.printf("%d%n%d%n%d%n%d%n%d%n%.2f", 
	//	sum45, diff45, prod45,quotient45,remain45,divi45);
	
	//1046
	Scanner sc46 = new Scanner (System.in);
	String str46 = sc46.nextLine();
	String[] input46 = str46.split(" ");
	int num461 = Integer.parseInt(input46[0]);
	int num462 = Integer.parseInt(input46[1]);
	int num463 = Integer.parseInt(input46[2]);

	int sum46 = num461+num462+num463;
	double avg46 = (double)sum46/3;
	
	//System.out.printf("%d%n%.1f", sum46, avg46);
}
