package Level2;

import java.util.HashSet;

public class P10_소수찾기 {
	
	public static void main(String[] args) {
		//test케이스
		
	}
  
    static HashSet<Integer> set = new HashSet<Integer>();
    static char numc [];
    static boolean visited[];
    
    public int solution(String numbers) {
        int answer = 0;
        
        numc = new char [numbers.length()];
        for(int i=0; i<numbers.length(); i++){
            numc[i] = numbers.charAt(i);
        }
        visited  = new boolean [numbers.length()];
        
        nm("",0);
        answer = set.size();
        
        return answer;
    }
    
    
    public void nm(String index , int n){ // n은 선택할 갯수
      
        if(index!=""){
            int num = Integer.parseInt(index);
            if(isPrime(num)){
                set.add(num);
            }   
        }
        
        if(n==numc.length){
            return;
        }
        
        
        for(int i=0; i<numc.length; i++){
            if(visited[i]==false){
                visited[i] = true;
                nm(index+numc[i], n+1);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime (int n){
        if(n==1 || n==0){
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }

}
