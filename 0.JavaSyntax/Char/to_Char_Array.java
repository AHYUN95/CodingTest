package Char;


import java.util.Scanner;

/*
 toCharArray() : ���ڿ� �����͸� char�迭�� �ѱ��ھ� ����
 */
public class to_Char_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] arr = sc.nextLine().toCharArray();
		System.out.println(arr[2]);  // 12345>3���, AHYUN>Y���
		sc.close();
		
	}

}
