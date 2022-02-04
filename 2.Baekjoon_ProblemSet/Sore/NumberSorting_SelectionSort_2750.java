package Sore;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class NumberSorting_SelectionSort_2750 {
	//น้มุ 2750, Selection Sort
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
			if(arr[i]>arr[j]) {
				int temp = 0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.print(sb);
	}
}
