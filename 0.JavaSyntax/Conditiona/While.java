package Conditiona;

public class While {

	public static void main(String[] args) {
		/*while(조건식){//조건식true일 경우 실해, false 종료(미실행)
		 *	반복 실행할 문장;
		 */
		int i = 4; //초기값 설정
		while(i > 4) {
			System.out.println(i--);
		//결과 > 아무것도 없음
		}

		/* do{
		  반복 실행할 문장; // 일단 무조건 한번 실행
		 }while(조건식); //조건 식이 true일 경우 실행
		 */
		int i2 = 4;
		do {
			System.out.println(i2--);
		}while (i2 > 4);
		//결과값 4
		
		
		
	}
		
		
	}


