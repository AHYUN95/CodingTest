package Level2;

public class P11_카펫 {

	public static void main(String[] args) {
		//TESTCASE
	}
	
    public int[] solution(int brown, int yellow) {
        
        
        int total = brown + yellow;
        int n = 0; //세로
        int m = 0;; //가로 > 세로
        for(int i=1; i<=Math.sqrt(total); i++){
            if(total%i == 0){
                n = i;
                m = total/i;
            if((n-2)*(m-2) == yellow){
                break;
                }
            }
            
        }

        int[] answer = {m,n};
        return answer;
    }

}
