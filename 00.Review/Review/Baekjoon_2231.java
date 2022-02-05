package Review;

//BruteForce > decomposition_sum
//N=234 의 가장 작은 생성자를 구해내는 프로그램
public class Baekjoon_2231 {

	public static void main(String[] args) {

		
		int output = 0;
		int index = 234;
		
		while(index>0) {
			index --; //233부터 생성자 인지 확인
			
			int com =0;
			int index2 = index;
			
			/*<Review point>
			 만약 
			 while(index>0) {
				com += index%10;
				index/=10;
			}
			index가 0이 되는 순간 while끝남 그리고 바깥 while도 끝남..
			index가 222인 경우도 돌아야 하는데..
			그래서 index2라는 값을 선언해서 이걸로 while안의 while을 돌려줌.
			이중 조건일때 잘 확인하자~
			
			 */
			while(index2>0) {
				com += index2%10;
				index2/=10;
			}
			int total = com + index;
			
			if(total == 234) {//분해합이 234이면 해당 index값은 생성자
				output = index;
			}
	}
		System.out.println(output);
}
}
