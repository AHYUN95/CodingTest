package TypeConversion;

public class integer_method {

	public static void main(String[] args) {
		//(input : string) 2,8,16���� > 10���� (return : ����)
		//Integer.parseInt(String input)
		int two = Integer.parseInt("10", 2); // 2���� 35�� 10������
		int eight = Integer.parseInt("35", 8); // 8���� 35�� 10������
		int sixteen = Integer.parseInt("35", 16); // 16���� 35�� 10������
		
		//�׳� input string 10 �������� return int 10������ �ٲٱ�
		// string > int
		int str = Integer.parseInt("35"); // ����� 35
		
		//(Input : ����) 10���� > (return:string) 2,8,16����
		String re2 = Integer.toBinaryString(35);
		String re8 = Integer.toOctalString(35);
		String re16 = Integer.toHexString(35);
		
		
	}

}
