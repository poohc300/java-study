package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			// ��� ��Ʈ��
			FileOutputStream fos = new FileOutputStream("test.txt");
		
			// ���� ��Ʈ��
			bos = new BufferedOutputStream(fos);
			
			// for(int i = 'a'; i <= 'z'; i++)
			for(int i = 97; i <= 122; i++) {
				bos.write(i);
			}
		} catch(FileNotFoundException ex) {
			System.out.println("Can't Open:" + ex);
		} catch(IOException ex) {
			System.out.println("Error:" + ex);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}