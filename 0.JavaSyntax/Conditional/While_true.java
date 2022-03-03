package Conditional;

public class While_true {

	public static void main(String[] args) {
		/*무한루프 
		while(true){
		계속 진행할것
			if(멈출 조건){
			break;}
				}
		*/
		int i =1;
		int sum =0;
		while(true) {			
				sum += i;
				i++; 				//if 조건 맞을때까지 계속
				if (sum >= 100) {
					break; 			// 조건이 맞으면 끝남 break!
				}
		}

		/*
		for(int i=n; i>0; i--) 동일
		while(t-->0)
		 * 
		 */
	}

}