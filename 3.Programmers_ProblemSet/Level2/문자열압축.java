package Level2;

public class 문자열압축 {

	public static void main(String[] args) {
		
		System.out.println(solution("acacacacabcdabcdaaeessced"));

	}

	static int solution (String s) {
		int answer =s.length();
		
		int count = 0;

		for(int i=1; i<=s.length()/2; i++) {//자르는 단뒤
			
			int check = 0; //앞에 꺼가 몇번 중복되는지 확인해줄 것임
			String index = s.substring(0,i);
			count = i + (s.length()%i);
			
			for(int j=i; j<=s.length()-i; j+=i) {
				if(index.equals(s.substring(j,j+i)) && check == 0){ //문자열 비교는 ==(주소값비교) 말고 .equals로 해주자 제발~
					count += 1;
					check += 1;
				}else if (index.equals(s.substring(j,j+i)) && check !=0) {
					check += 1;
				}else {
					index = s.substring(j,j+i);
					count+= i;  
					check = 0;
				}
		}
			answer = Math.min(answer, count); //for문 돌면서 최소값을 추가해준다.
	}	
		return answer;
}


}
