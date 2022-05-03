package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			//1. ��� ��Ʈ��(ǥ���Է�, stdin, System.in)
		
			//2. ���� ��Ʈ��1(byte|byte|byte -> char) 
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			//3. ���� ��Ʈ��2(char1|char2|char3|\n -> "char1char2char3")
			br = new BufferedReader(isr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				if("quit".equals(line)) {
					break;
				}
				
				System.out.println(line);
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("error:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}