package Level2;

public class ���ڿ����� {

	public static void main(String[] args) {
		
		System.out.println(solution("acacacacabcdabcdaaeessced"));

	}

	static int solution (String s) {
		int answer =s.length();
		
		int count = 0;

		for(int i=1; i<=s.length()/2; i++) {//�ڸ��� �ܵ�
			
			int check = 0; //�տ� ���� ��� �ߺ��Ǵ��� Ȯ������ ����
			String index = s.substring(0,i);
			count = i + (s.length()%i);
			
			for(int j=i; j<=s.length()-i; j+=i) {
				if(index.equals(s.substring(j,j+i)) && check == 0){ //���ڿ� �񱳴� ==(�ּҰ���) ���� .equals�� ������ ����~
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
			answer = Math.min(answer, count); //for�� ���鼭 �ּҰ��� �߰����ش�.
	}	
		return answer;
}


}
