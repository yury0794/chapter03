package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			// FileOutputStream fis = new FileOutputStream("123.txt");
			// BufferedOutputStream bos = new BufferedOutputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.txt"));

			// for(int i = '1';i<'9';i++) 아스키 코드표 참조
			for (int i = 49; i < 57; i++) {
				bos.write(i); // refresh 해보면 나온다
			}
			// bos.flush(); // 내부 버퍼의 내용을 파일에 쓰기
			bos.close(); // 닫을 때 자동적으로 flush가 일어남
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}