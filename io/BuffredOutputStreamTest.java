package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffredOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = null;
		
		try {
			// ��� ��Ʈ��
			FileOutputStream fos = new FileOutputStream("text.txt");
			
			// ���� ��Ʈ��
			bos = new BufferedOutputStream(fos);
			
			
		}
	}

}
