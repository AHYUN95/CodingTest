package JavaSyntax;

public class breack_continue {

	public static void main(String[] args) {
	//continue = 반복문의 현재 단계를 중단
	for(int index = 1; index <=5 ; index++) {
		if(index==3) {
			continue;
		}
		System.out.println(index);
		}
	// 출력 1 2 4 5
	
	//break = 반복문 자체를 중단
	for(int index =1; index <=5; index++) {
		if(index==3) {
			break;
		}
		System.out.println(index);
	}
	//출력 1,2
	
	}

	}

