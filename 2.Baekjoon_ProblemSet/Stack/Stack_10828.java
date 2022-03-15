package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack_10828 {
	
	static int [] stack ;
	static int size =0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		stack = new int [n];
		
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			
			switch(str[0]) {
			
			case "push":
				push(Integer.parseInt(str[1]));
				break;
				
			case "pop":
				sb.append(pop()+"\n");
				break;
				
			case "size":
				sb.append(size()+"\n");
				break;
			
			case "empty":
				sb.append(empty()+"\n");
				break;
				
			case "top":
				sb.append(top()+"\n");
				break;	
			}
			
		}
		System.out.println(sb);
	}
	
	
	static void push(int n) {
		stack[size] = n;
		size++;
	}
	
	static int pop() {
		if(size==0) {
			return -1;
		}else {
			int res = stack[size-1];
			stack[size-1] = 0;
			size--;
			return res;
	}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	static int top() {
		if(size==0) {
			return -1;
		}else {
			return stack[size-1];
		}
	}
	
}