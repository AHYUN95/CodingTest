package Level2;

public class P04_124나라의_숫자 {

	public static void main(String[] args) {
		// test case
		System.out.println(solution(10));
		
	}
	
    static String solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            int num = n%3;
            if(num==0){
                sb.append(4);
                n = n/3-1;
            }else{
                sb.append(num);
                n=n/3 ;
            }
        }
        return sb.reverse().toString();     
       }
}
