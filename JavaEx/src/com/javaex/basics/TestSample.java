package com.javaex.basics;
import java.util.Scanner;
public class TestSample {

	public static void main(String[] args) {
		//소수인지 아닌지 확인하는 코드
		SosuCode();

	}
	private static void SosuCode() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요. : ");
		int number = scan.nextInt();
		int x = 3;
		if (number%2==0) {
			System.out.println(number+"은(는) 2로 나누어지므로 소수가 아닙니다.");
		} else {
			while (x!=number) {
				if (number%x==0) {
					break;
				} else {
					x++;
				} 
			}
			if (x==number) {
			System.out.println(number+"은(는) 소수입니다.");
			} else {
			System.out.println(number+"은(는) "+x+"로 나누어지므로 소수가 아닙니다.");
		}
		scan.close();
			}

	}
}