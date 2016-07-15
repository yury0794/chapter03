package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}