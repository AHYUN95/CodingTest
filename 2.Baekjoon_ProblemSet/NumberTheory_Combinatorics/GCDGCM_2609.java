package NumberTheory_Combinatorics;

import java.util.Scanner;

public class GCDGCM_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		int GDB = 0;
		int min = Math.min(n1, n2);
		
		for(int i=min; i>0; i--) {
			if(n1%i==0 & n2%i==0) {
				GDB = i;
				break;
			}
		}
		
		int GCM = GDB*(n1/GDB)*(n2/GDB);
		System.out.print(GDB+"\n"+GCM);
			
	}

}
