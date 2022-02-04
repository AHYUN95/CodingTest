package Basic;

public class array {

	public static void main(String[] args) {
	//1차 배열 생성
	//타입 [] 변수명 = new 타입[값갯수];
		int[] array1 = new int[4];
	
	//선언과 동시에 초기화
		int[]array2 = new int[] {1,2,3,4};
		int[]array3 = {1,2,3,4,5};
	
	//배열 1부터 넣기
		int array4[] = new int [100];
		for(int i =0; i <= array4.length; i++) {
			array4[i] = i+1;
		}
	
	//배열에 저장된 값 더하기
		int sum=0;
		for(int i=0; i<= array4.length; i++) {
			sum = sum+array4[i];
		}System.out.println(sum);
		
		//경고창 보기 싫어서 생성함..
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
	}

}
