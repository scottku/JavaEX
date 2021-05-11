package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg"; // -> read
	static String target = rootPath + "img_copy.jpg";// <- write
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				// 출력
				os.write(data);
			}
			
			os.close();
			is.close();
			
			System.out.println("파일을 복사했습니다.");
			
			// TODO : 성능 개선 (보조 스트림 이용)
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
