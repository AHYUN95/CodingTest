package JavaSyntax;

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
	
	}

	}

