package Conditiona;

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
	int i =1;
	 while(true) {
		if (i%1==0 && i%2==0 && i%3==0) {
			System.out.println(i);  //결과 값 6 , 조건 만족했을 때 print
			break;
			}
			System.out.println(i); //결과 값 1,2,3,4,5, 조건 만족하기 전까지 print
			i++;
		}

	
	//
	}

	}

