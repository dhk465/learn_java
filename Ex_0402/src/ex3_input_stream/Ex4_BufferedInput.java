package ex3_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex4_BufferedInput {
	public static void main(String[] args) throws IOException {
		
		// Buffered��Ʈ���� ���� ������ �аų� ���� ���۸� �۾��� ����
		// ������� �ڷḦ ���� �޸� ������ ��Ƶξ��ٰ� �ѹ��� ���
		// �� ������ Ȱ���ϸ� ����� �ӵ� ��� ����
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte[] result = new byte[100];
		
		try {
			
			String path = FilePath.PATH + "/test.txt";
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			
			bis.read(result);
			
			System.out.println(new String (result));
			
		} catch (Exception e) {
			
		} finally {
			
			// try�� �־�θ� Exception �߻��� close()���� ���� �� �־�
			// finally�� �־�д�.
			fis.close();
			bis.close();
			
		}
		
	} // main
}