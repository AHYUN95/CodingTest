package Queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * FIFO
 */
public class Queue2_18258 {
	
	static int [] queue; 
	static int front =0; //앞에꺼 삭제할때 표시
	static int size =0;
	static int back =0; //추가할때 back표시

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		queue = new int [n];
		
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
			
			case "front":
			sb.append(front()+"\n");
			break;
			
			case "back":
			sb.append(back()+"\n");
			break;
				
			}
		}	
		System.out.println(sb);
	}
	
	static void push(int n) {
		queue[back] = n;
		size++;
		back++;
	}
	
	static int pop() {
		if(size==0) {
			return -1;
		}else {
		int res = queue[front];
		queue[front] = 0;
		size--;
		front++;
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
	
	static int front() {
		if(size==0) {
			return -1;
		}else {
			return queue[front];
		}
	}
	
	static int back() {
		if(size==0) {
			return -1;
		}else {
			return queue[back-1];
		}
	}

}
