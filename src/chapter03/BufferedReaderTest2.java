package chapter03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ms949_2.txt");
			InputStreamReader isr = new InputStreamReader(fis, "ms949"); // 바이트 단위
			BufferedReader br = new BufferedReader(isr); // 보조스트림 두개 연결, 캐릭터 단위

			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}