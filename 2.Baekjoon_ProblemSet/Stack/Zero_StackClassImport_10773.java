package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_StackClassImport_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i=0; i<k; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input==0) {
				stack.pop();
			}else {
				stack.push(input);
			}
		}
		int sum =0;
		
		for(int o :stack) {
			sum+= o;
		}
		
		System.out.println(sum);

	}

}
