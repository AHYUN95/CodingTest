package BinarySearch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 랜선자르기_1654 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp [] = br.readLine().split(" ");
		
		int k = Integer.parseInt(temp[0]);
		int n = Integer.parseInt(temp[1]);
		
		int arr [] = new int [k];
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long high = arr[k-1]; //왜 가장 작은 길이로 자르면 안되는 걸까?
		long low = 1;
		long mid = 0;
		
		while(low <= high) {
			
			mid = (low+high)/2;
			
			long count = 0;
			
			
			for(int i=0; i<arr.length; i++) {
				count += (arr[i]/mid);
			}
				if(count >= n) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		
		System.out.println(low-1);
	}
}
