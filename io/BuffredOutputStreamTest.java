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
			// 기반 스트림
			FileOutputStream fos = new FileOutputStream("text.txt");
			
			// 보조 스트림
			bos = new BufferedOutputStream(fos);
			
			
		}
	}

}
