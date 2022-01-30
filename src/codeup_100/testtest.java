package codeup_100;

import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
	
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
