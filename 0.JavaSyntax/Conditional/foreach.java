package Conditional;
public class foreach {

	public static void main(String[] args) {
		//for each
		//for(Ÿ�� ���� �޾��� ������ : ����ϰ� ���� �ڷᱸ��)
		//for �� �ȿ� ������ : �ڷᱸ���� ���� ���� �����̾����
		int [] iarr = {1,2,3,4,5};
		//�⺻ for������ ��Ÿ���ָ�
		
		for(int i = 0; i<iarr.length; i++) {
			int value = iarr [i];
			System.out.println(value);
		}

		//foreach (���� for������ ��Ÿ���ָ�)
	
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
