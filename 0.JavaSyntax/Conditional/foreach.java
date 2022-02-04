package Conditional;
public class foreach {

	public static void main(String[] args) {
		//for each
		//for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조)
		//for 문 안에 변수명 : 자료구조는 값은 변수 유형이어야함
		int [] iarr = {1,2,3,4,5};
		//기본 for문으로 나타내주면
		
		for(int i = 0; i<iarr.length; i++) {
			int value = iarr [i];
			System.out.println(value);
		}

		//foreach (향상된 for문으로 나타내주면)
	
		for(int value : iarr) {
			System.out.println(value);
		}
	
	}
	
		/*	Scanner sc65 = new Scanner(System.in);
		String input65 = sc65.nextLine();
		String [] str65 = input65.split(" ");
		
		for (String result65 : str65) {
			int num65 = Integer.parseInt(result65);
			if(num65%2==0) {
				System.out.println(num65);
			}
		}
		 */

}
