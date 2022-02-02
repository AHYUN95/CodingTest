package Basic;
import java.io.BufferedReader; //BufferedReader
import java.io.InputStreamReader; //BufferedReader
import java.io.IOException;
import java.io.BufferedWriter; //BufferWriter
import java.io.OutputStreamWriter; //BufferWriter

public class Buffer {

	public static void main(String[] args) throws IOException{ //Buffered사용을 위한 예외처리
		
		//BufferedReader사용법
		//Enter만 경계로 인식, 받은 데이터가 String으로 고정
		//입력받은 데이터 가공하는 작업 필요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼에 입력 값 넣어주기
		String s = br.readLine(); //입력 String으로 받아줌, 한줄만 읽음
		int num = Integer.parseInt(s); //형변환
		// int num = Integer.parseInt(br.readLine());
		br.close(); // 종료
		
		
		//BufferWriter사용법
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //
		bw.write(num); //출력
		bw.flush();	//write로 담은 내용 출력 후 버퍼를 비움
		bw.close(); //종료
		
	}

}
