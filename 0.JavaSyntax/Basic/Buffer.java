package Basic;
import java.io.BufferedReader; //BufferedReader
import java.io.InputStreamReader; //BufferedReader
import java.io.IOException;
import java.io.BufferedWriter; //BufferWriter
import java.io.OutputStreamWriter; //BufferWriter

public class Buffer {

	public static void main(String[] args) throws IOException{ //Buffered����� ���� ����ó��
		
		//BufferedReader����
		//Enter�� ���� �ν�, ���� �����Ͱ� String���� ����
		//�Է¹��� ������ �����ϴ� �۾� �ʿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���ۿ� �Է� �� �־��ֱ�
		String s = br.readLine(); //�Է� String���� �޾���, ���ٸ� ����
		int num = Integer.parseInt(s); //����ȯ
		// int num = Integer.parseInt(br.readLine());
		br.close(); // ����
		
		
		//BufferWriter����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //
		bw.write(num); //���
		bw.flush();	//write�� ���� ���� ��� �� ���۸� ���
		bw.close(); //����
		
	}

}
