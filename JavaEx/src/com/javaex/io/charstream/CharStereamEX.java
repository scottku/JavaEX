package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStereamEX {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath = "test.txt";
	public static void main(String[] args) {
		// 텍스트 기록 (Writer)
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit Computer\r\n");
			fw.write("Java Programming\r\n");
			fw.write("2021.05");
			fw.flush(); // 버퍼 비우기
			fw.close();
			
			System.out.println("파일 기록 완료");
			
			// 텍스트 파일 읽어오기
			Reader fr = new FileReader(filename);
			System.out.println("----------");
			int data = 0;
			while ((data = fr.read()) != -1) {
				// int 읽은 후 내부 데이터는 마지막 2바이트
				System.out.print((char)data + " ");
			}
			System.out.println();
			fr.close();
			System.out.println("파일을 읽었습니다.");
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
