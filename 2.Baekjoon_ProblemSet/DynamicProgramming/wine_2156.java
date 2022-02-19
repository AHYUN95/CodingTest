package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wine_2156 {

	static Integer s [];
	static int warr [];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		warr= new int [n+1];
		warr[0] = 0;
		for(int i=1; i<n+1; i++) {
			warr[i] = Integer.parseInt(br.readLine());
		}
		//s�Լ� ���� �־��ٲ���
		s = new Integer [n+1];
		s[0] = 0;
		s[1] = warr[1];
		
		if(n>=2) {
		s[2] = warr[1]+warr[2];
		}
		
		System.out.println(S(n));

	}
	
	static int S(int n) {
		
		if(s[n]==null) {
			//top down ��ʹ� ������ �������� �����Ѵٴ� ����������
			//�������� ������ �����ϴ� ���� �ƴ�, ���� S(n)�� S(n-1) ��
			s[n] = Math.max(Math.max(S(n-3)+warr[n-1],S(n-2))+warr[n],S(n-1));
		}
		return s[n];
	}

}
