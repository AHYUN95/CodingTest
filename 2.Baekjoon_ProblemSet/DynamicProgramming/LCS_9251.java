package DynamicProgramming;

import java.util.Scanner;

public class LCS_9251 {

	static String s1;
	static String s2;
	static char c1 [];
	static char c2 [];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		s1 = sc.next();
		s2 = sc.next();
		sc.close();
		
		c1 = new char [s1.length()];
		c2 = new char [s2.length()];
		
		for(int i=0; i<s1.length(); i++) {
			c1 [i] = s1.charAt(i); 
		}
		
		for(int i=0; i<s2.length(); i++) {
			c2 [i] = s2.charAt(i); 
		}
		
		System.out.println(LCS(0,0));
		System.out.println(LCS(1,0));
		System.out.println(LCS(2,0));
		System.out.println(LCS(3,0));
		System.out.println(LCS(4,0));
		System.out.println(LCS(5,0));
		/*
		int Max = 0;
		for(int i=0; i<s1.length();i++) {
			Max = Math.max(Max,LCS(i,0));
		}
		
		System.out.println(Max);
	*/
	}
	
	//몇번째 c1에서 n번째 인덱스에 대해서 c2의 s번째 인덱스에서 부터 서치 
	static int LCS(int n, int s) {
			if(n==s1.length()) {
				return 0;
			}
		
			for(int i=s; i<s2.length();i++) {
				if(c1[n]==c2[i]) {
					return LCS(n+1,i+1) + 1;	
					}
				}
				return 0;
		}			
	}
