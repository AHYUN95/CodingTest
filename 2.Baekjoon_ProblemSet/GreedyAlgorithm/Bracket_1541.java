package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bracket_1541{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String [] minus = s.split("\\-");

			int sum = 0;
			//-������ ���� �� minus[0] ����
			String [] first = minus[0].split("\\+");
			for(int i=0; i<first.length; i++) {
				sum += Integer.parseInt(first[i]);
			}
		
			// - ���� ���� ����(minus[1]����)�� �� -�� �����ؼ� �� ���ָ� �ȴ�
			for(int i=1; i<minus.length; i++) {
				String [] plus = minus[i].split("\\+");
				for(int j=0; j<plus.length; j++) {
					sum += -Integer.parseInt(plus[j]);
				}
			}
			System.out.println(sum);	

	}
	}
