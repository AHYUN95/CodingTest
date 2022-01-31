package codeup_100;
import java.util.Scanner;
public class code_1030_1078_1092 {

	//1078 짝수 합 구하기
	public static void main1078(String[] args) {
	
		Scanner sc78 = new Scanner(System.in);
		int num78 = sc78.nextInt();
		sc78.close();
		int sum = 0;
		for (int i = 1; i <= num78 ; i++){
			if(i%2==0) {
				sum = sum + i;
				}
		}System.out.println(sum);

	}

	
	//1079 원하는 문자가 입력될 떄까지 반복 출력
	public static void main1079(String[] args) {
	
		Scanner sc79 = new Scanner (System.in);
		String [] str79 = sc79.nextLine().split(" ");
		sc79.close();
		
		for(String result79 : str79) {
			System.out.println(result79);
			if(result79.equals("q")) {
			break;
			}
		}
	}
	
	
	//1080 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력
	public static void main1080(String[] args) {
		Scanner sc80 = new Scanner(System.in);
		int num80 = sc80.nextInt();
		int sum80 = 0;
		int i80;
		sc80.close();
		
		for (i80=0 ; i80 <= 45; i80++) {
			sum80 += i80;
			if(sum80 >= num80) {
				//System.out.println(i80);
				break;
			}
		} System.out.println(i80);	
	}
	
	
	//1081 주사기 2개 던지면
	public static void main1081(String[] args) {
		Scanner sc81 = new Scanner(System.in);
		String[] str81 = sc81.nextLine().split(" ");
		int n = Integer.parseInt(str81[0]);
		int m = Integer.parseInt(str81[1]);
		sc81.close();
		
		int rn;
		int rm;
		for (rn=1; rn <= n; rn++) {
			for(rm=1; rm <=m; rm++) {
				System.out.printf("%d %d%n", rn, rm);
			}
		}	
	}
	
	
	//1082 16진수 구구단
	public static void main1082(String[] args) {
		Scanner sc82 = new Scanner(System.in);
		int input83 = sc82.nextInt(16);
		
		for(int i=1; i < 16 ; i++) {
			System.out.printf("%X*%X=%X%n", input83 ,i, input83*i);
		}
		
		sc82.close();
	}
	
	//1083 3,6,9게임
	
	public static void main1083(String[] args) {
		Scanner sc83 = new Scanner(System.in);
		int num83 = sc83.nextInt();
		sc83.close();
		for(int i83 =1; i83 <= num83 ; i83++) {
			if(i83%3==0) {
				System.out.print("X ");
			}else
			System.out.printf("%d ",i83);
		}
	}
	
	
	//1084 RGB경우의 수
	public static void main1084(String[] args) {
		Scanner sc84 = new Scanner(System.in);
		String [] str84 = sc84.nextLine().split(" ");
		int red = Integer.parseInt(str84[0]);
		int green= Integer.parseInt(str84[1]);
		int blue = Integer.parseInt(str84[2]);
		sc84.close();

		for(int ir=0; ir <red ; ir++) {
			for(int ig=0; ig < green ; ig++) {
				for(int ib=0; ib<blue; ib++) {
					System.out.printf("%d %d %d%n",ir, ig,ib);
				}
			}
		}
		System.out.println(red*green*blue);
		
	}
	
	
	//1085 bit mb 로 변환
	public static void main1085(String[] args) {
		Scanner sc85 = new Scanner(System.in);
		String[] str85 = sc85.nextLine().split(" ");
		int h85 = Integer.parseInt(str85[0]);
		int b85 = Integer.parseInt(str85[1]);
		int c85 = Integer.parseInt(str85[2]);
		int s85 = Integer.parseInt(str85[3]);
		sc85.close();
		 
		double mb85 = 1024*1024*8; //1MB=1024*1024*8bit
		double pcmBit = h85*b85*c85*s85; // bit
		double pcmMb = pcmBit/mb85;
		System.out.printf("%.1f MB",pcmMb);
		
	}

	//1086 그림파일 저장 용량 계산
	public static void main1086(String[] args) {
		Scanner sc86 = new Scanner(System.in);
		String[] str86 = sc86.nextLine().split(" ");
		int w86 = Integer.parseInt(str86[0]);
		int h86 = Integer.parseInt(str86[1]);
		int b86 = Integer.parseInt(str86[2]);
		sc86.close();
		
		double mb86 = 1024*1024*8; // bit
		double result86 = (w86*h86*b86)/mb86;
		System.out.printf("%.2f MB",result86);
		
	}
	
	
	//1087 for문으로 풀기
	public static void main1087(String[] args) {
		Scanner sc87 = new Scanner(System.in);
		int num87 = sc87.nextInt();
		sc87.close();
		
		
		int i;
		int sum = 0;
		for(i=1; i <14142; i++) {
			sum += i;
			if (sum >= num87) {
				System.out.println(sum);
				break;
			}
		}
	}
	
	
	//1087 while(true)문으로 풀기
	public static void main1087_2(String[] args) {
		Scanner sc872 = new Scanner(System.in);
		int num872 = sc872.nextInt();
		sc872.close();
		
		int i87=0;
		int sum87 = 0;
		while(true){
			sum87 += i87;
			if (sum87 >= num872) {
				System.out.println(sum87);
				break;
			}
			i87++;
		}
	}
	
	
	//1088 3배수 건너띄기
	public static void main1088(String[] args) {
	
	Scanner sc88 = new Scanner(System.in);
	int num88 = sc88.nextInt();
	sc88.close();
	
	for(int i=1 ; i <= num88; i++) {
		if(i%3==0) {
			continue;
		}System.out.printf("%d ", i);
	}
	}
	
	
	//1089 등차
	public static void main1089(String[] args) {
		
		Scanner sc89 = new Scanner(System.in);
		String [] str89 = sc89.nextLine().split(" ");
		
		int a89 = Integer.parseInt(str89[0]);
		int d89 = Integer.parseInt(str89[1]);
		int num89 = Integer.parseInt(str89[2]);
		sc89.close();
		
		int result89 = a89 + d89*(num89-1);
		System.out.println(result89);
		
	}
	
	
	//1090 등비
	public static void main1090(String[] args) {
		
		Scanner sc90 = new Scanner(System.in);
		String[] str90 = sc90.nextLine().split(" ");
		
		int a90 = Integer.parseInt(str90[0]);
		int r90 = Integer.parseInt(str90[1]);
		int n90 = Integer.parseInt(str90[2]);
		sc90.close();
		
		long result = a90*(long)Math.pow(r90,n90-1);
		System.out.println(result);
	}
	
	
	//1091 수열 만들기
	public static void main1091(String[] args) {
		Scanner sc91 = new Scanner(System.in);
		String[] str91 = sc91.nextLine().split(" ");
		
		int a91 = Integer.parseInt(str91[0]);
		int m91 = Integer.parseInt(str91[1]);
		int d91 = Integer.parseInt(str91[2]);
		int n91 = Integer.parseInt(str91[3]);
		sc91.close();
		
		int result91 = a91;
		for(int i=1; i<n91; i++ ) {
			result91 = result91*m91 +d91;
		} System.out.println(result91);
	}
	
	
	//1092 채점기록
	public static void main1092(String[] args) {
		Scanner sc92 = new Scanner(System.in);
		String[] str92 = sc92.nextLine().split(" ");
		sc92.close();
		int f92 = Integer.parseInt(str92[0]);
		int s92 = Integer.parseInt(str92[1]);
		int t92 = Integer.parseInt(str92[2]);
	
		int i92=1;
		while(true) {
			if (i92%f92==0 && i92%s92==0 && i92%t92==0) {
				System.out.println(i92);
				break;
			}
			i92++;
		}
	}
	
}
