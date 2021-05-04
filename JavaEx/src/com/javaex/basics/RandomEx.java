package com.javaex.basics;

public class RandomEx {

	public static void main(String[] args) {
		//randomEx();
		//forRandomEx();
		whileRandomEx();

	}
	private static void whileRandomEx() {
		int i = 1;
		while (i <= 6) {
			System.out.println((int)(Math.random()*45)+1);
			System.out.println(" ");
			i++;
		}
	}
	
	private static void forRandomEx()	{
		//1에서 45의 숫자 중 6개 숫자 랜덤하게 추출하기(중복체크 x)
		
		for (int i = 1;i<=6;i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+" ");
		}
	}
	
	private static void randomEx()	{
		int num = (int)(Math.random()*6)+1; //Math.random()시 0.0<= x < 1.0 사이 값 랜덤 추출
		System.out.println(num);
	}

}
