package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zero_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int stack [] = new int [k];
		
		int size =0;
		for(int i=0; i<k; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input==0) {
				stack[size-1]=0;
				size--;
			}else {
				stack[size] = input;
				size++;
			}
		}
		
		int sum =0;
	
		for(int i=0; i<size; i++) {
			sum += stack[i];
		}
		
		System.out.println(sum);
		}
	}

