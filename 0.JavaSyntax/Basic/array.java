package Basic;

public class array {

	public static void main(String[] args) {
	//1�� �迭 ����
	//Ÿ�� [] ������ = new Ÿ��[������];
		int[] array1 = new int[4];
	
	//����� ���ÿ� �ʱ�ȭ
		int[]array2 = new int[] {1,2,3,4};
		int[]array3 = {1,2,3,4,5};
	
	//�迭 1���� �ֱ�
		int array4[] = new int [100];
		for(int i =0; i <= array4.length; i++) {
			array4[i] = i+1;
		}
	
	//�迭�� ����� �� ���ϱ�
		int sum=0;
		for(int i=0; i<= array4.length; i++) {
			sum = sum+array4[i];
		}System.out.println(sum);
		
		//���â ���� �Ⱦ ������..
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
	}

}
