package NumberTheory_Combinatorics;

import java.util.Scanner;


public class FactorialZero_1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		//5나 10을 만났을때 0 이 하나 더 생긴다
		//25 50, 100 +2, 125 250 500 +3
		int count =0;
		for(int i=1; i<=N; i++) {

			if(i%125==0 || i%250==0 || i%500==0) {
				count+=3;
			}
			else if(i%25==0 || i%50==0 ||i%100==0){
				count+=2;
			}else if(i%5==0 || i%10==0)  {
				count++;;
			}
		}
		System.out.println(count);
	}
	}
