package Conditiona;

public class breack_continue {

	public static void main(String[] args) {
	//continue = �ݺ����� ���� �ܰ踦 �ߴ�
	for(int index = 1; index <=5 ; index++) {
		if(index==3) {
			continue;
		}
		System.out.println(index);
		}
	// ��� 1 2 4 5
	
	//break = �ݺ��� ��ü�� �ߴ�
	for(int index =1; index <=5; index++) {
		if(index==3) {
			break;
		}
		System.out.println(index);
	}
	//��� 1,2
	int i =1;
	 while(true) {
		if (i%1==0 && i%2==0 && i%3==0) {
			System.out.println(i);  //��� �� 6 , ���� �������� �� print
			break;
			}
			System.out.println(i); //��� �� 1,2,3,4,5, ���� �����ϱ� ������ print
			i++;
		}

	
	//
	}

	}

