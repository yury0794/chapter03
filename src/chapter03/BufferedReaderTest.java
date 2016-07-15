package chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/chapter03/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);

			String s = null;
			int index = 0;
			while ((s = br.readLine()) != null) {
				String line = String.format("%3d:%S", ++index, s); // 숫자: 간격맞춤, %3d:세칸 밀어넣음
				System.out.println(line);
			}
			br.close(); // 하나만 닫으면 다 닫힘
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}