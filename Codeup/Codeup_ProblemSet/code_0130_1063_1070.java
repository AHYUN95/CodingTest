package Codeup_ProblemSet;
import java.util.Scanner;
public class code_0130_1063_1070 {

	//1063 삼항연산 큰값 출력
	public static void main1063(String[] args) {
	Scanner sc63 = new Scanner(System.in);
	String input63 = sc63.nextLine();
	String[] str63 = input63.split(" ");
	sc63.close();
	
	int num63f = Integer.parseInt(str63[0]);
	int num63s = Integer.parseInt(str63[1]);
	
	int result63 = num63f>num63s ? num63f : num63s ;
	System.out.println(result63);

	}
	
	// 1064 삼항연사 세가지 값 중에 가장 작은 값 
	public static void main1064(String[] args) {
	Scanner sc64 = new Scanner(System.in);
	String input64 = sc64.nextLine();
	String [] str64 = input64.split(" ");
	sc64.close();
	
	int num64f = Integer.parseInt(str64[0]);
	int num64s = Integer.parseInt(str64[1]);
	int num64t = Integer.parseInt(str64[2]);
	
	int result64 = (num64f<num64s ? num64f : num64s) < num64t ? (num64f<num64s ? num64f : num64s) : num64t ;
	System.out.println(result64);
	
	}
	
	//1065 정수 3개 입력 받아서 짝수만 출력, 선택 실행 구조
	public static void main1065(String[] args) {
		
	Scanner sc65 = new Scanner(System.in);
	String input65 = sc65.nextLine();
	String [] str65 = input65.split(" ");
	
	for (String result65 : str65) {
		int num65 = Integer.parseInt(result65);
		if(num65%2==0) {
			System.out.println(num65);
		}
	}
		sc65.close();	
	}
	
	//1066 3개 입력 짝,혹 출력
	public static void main1066(String[] args) {
	
	Scanner sc66 = new Scanner(System.in);
	String[] str65 = sc66.nextLine().split(" ");
	
	for (String result66 : str65) {
		int num66 = Integer.parseInt(result66);
		if(num66%2==0){
			System.out.println("even");
		}else System.out.println("odd");
				
			}
	sc66.close();
		}
	
	//1067 정수 한개 입력 받아서 음양 짝수 출력
	public static void main1067(String[] args) {
		
	Scanner sc67 = new Scanner(System.in);
	int num67 = sc67.nextInt();
	sc67.close();
	
	if(num67 >=0) {
		System.out.println("plus");
	}else 
		System.out.println("minus");
	
	if(num67%2==0) {
		System.out.println("even");
	}else 
		System.out.println("odd");
	}
	
	//1068 정수 1개 입력받아 평가 출력
	public static void main1068(String[] args) {
	
		Scanner sc68 = new Scanner(System.in);
		int num68 = sc68.nextInt();
		sc68.close();
		if(num68 >= 90) {
			System.out.println("A");
		}else if(num68 >= 70 && num68 <90) {
			System.out.println("B");
		}else if(num68 >= 40 && num68 <70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
			
		}
	
	//1069 A,B,C,D..오 입력 받아서 말하기
	public static void main1069(String[] args) {
		Scanner sc69 = new Scanner(System.in);
		char ch69 = sc69.next().charAt(0);
		sc69.close();
		
		switch(ch69) {
		case 'A' :
		System.out.println("best!!!");
			break;
		case 'B' :
		System.out.println("good!!!");
			break;
		case 'C' :
		System.out.println("run!!!");
			break;
		case 'D' :
		System.out.println("slowly!!!");
			break;
		default :
			System.out.println("what?");	
		}
	}
	
	//계절 말하기
	public static void main1070(String[] args) {
		Scanner sc70 = new Scanner(System.in);
		int ch70 = sc70.nextInt();
		sc70.close();
		
		switch(ch70) {
		case 12: case 1: case 2:
		System.out.println("winter");
			break;
		case 3: case 4: case 5:
		System.out.println("spring");
			break;
		case 6: case 7: case 8:
		System.out.println("summer");
			break;
		case 9: case 10: case 11:
		System.out.println("fall");
			break;
		}
	}
	
	
	}
	
		

