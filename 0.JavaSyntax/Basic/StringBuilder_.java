package Basic;

public class StringBuilder_ {
	
	public static void main(String[] args) {
	for(int i=0; i<=10; i++) {
		System.out.println("Hello"); // 시간 너무 많이 쓰게됨
	}//매번 바로 출력
		
	StringBuilder sb = new StringBuilder(); // StringBuilder 생성자
	for(int i=0;i<=10; i++) {
	sb.append("Hello2\n");
	}	
	
	System.out.println(sb);
	/*
	* 모아서 한번에 출력, 반복해서 출력해야 하는 경우는 StringBuilder사용
	*sb.toString() 하지 않아도 출력 결과가 나오는 이유는 StringBuilder자체에
	*toString이 오버라이딩 되어있기 때문
	*/
		
	}
	}


