package TypeConversion;

public class integer_method {

	public static void main(String[] args) {
		//(input : string) 2,8,16진수 > 10진수 (return : 정수)
		//Integer.parseInt(String input)
		int two = Integer.parseInt("10", 2); // 2진수 35를 10진수로
		int eight = Integer.parseInt("35", 8); // 8진수 35를 10진수로
		int sixteen = Integer.parseInt("35", 16); // 16진수 35를 10진수로
		
		//그냥 input string 10 진수에서 return int 10진수로 바꾸기
		// string > int
		int str = Integer.parseInt("35"); // 결과값 35
		
		//(Input : 정수) 10진수 > (return:string) 2,8,16진수
		String re2 = Integer.toBinaryString(35);
		String re8 = Integer.toOctalString(35);
		String re16 = Integer.toHexString(35);
		
		
	}

}
