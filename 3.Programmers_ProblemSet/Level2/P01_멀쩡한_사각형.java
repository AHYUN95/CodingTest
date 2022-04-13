package Level2;

public class P01_������_�簢�� {

	public static void main(String[] args) {
		//test case
		System.out.println(solution(8,12));
	}
	static long solution(int w, int h) {
	        

	        long GCD = GCD(w,h);
	        
	        long GW = (long)w/GCD;
	        long GH = (long)h/GCD;
	        
	        long totaltri = GCD*tri(GW,GH);
	        return (((long)w*h)-totaltri);

	    }
	    
	    //����� ���ϱ�
	    static int GCD(int a, int b){
	        while(b!=0){
	            int r = a%b;
	            a=b;
	            b=r;
	        }
	        return a;
	    }
	    //������ �ʴ� �ﰢ�� ���ϱ�
	    
	    static long tri(long w, long h){
	        
	        long min = Math.min(w,h);
	        long max = Math.max(w,h);
	        
	        long temp = max-min;
	        long result = 0;
	        if(temp==1){
	            result = min*2;
	        }else{
	            result = min*2 +(temp-1);
	        }
	        
	        return result;
	    }

}
