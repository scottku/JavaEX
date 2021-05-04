package com.javaex.basics.reftypes;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		//problem01();// 배열 데이터를 이용해 3의 배수의 개수와 배수의 합을 출력하는 프로그램
		//problem02();// 5개의 숫자를 키보드로 입력받아 배열에 저장 후, 평균을 구하는 프로그램
		//problem03();// 주어진 문자열의 공백을 ','로 변경하여 출력하는 프로그램
		problem04();// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하는 프로그램
		//problem05(); // 배열 내에서 특정 점수 이상 값만 뽑아 총 합과 평균값 산출하는 프로그램
	}
	private static void problem01() {
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int num = 0;
		int sum = 0;
		for(int i : data) {
			if (i%3==0) {
				num++;
				sum += i;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=> "+num);
		System.out.println("주어진 배열에서 3의 배수의 합=> "+sum);
	}
	
	private static void problem02() {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int num = 0;
		int total = 0;
		System.out.print("숫자를 입력하세요 : ");
		for(int i = 0 ; i < array.length; i++) {
			array[i] = sc.nextInt();
			num++;
		}
		for(int i=0;i<array.length;i++)	{
			total += array[i];
		}
		System.out.println("평균은 " + total/num  + "입니다.");
		sc.close();
	}
	
	private static void problem03() {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<c.length;i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
	}
	
	private static void problem04() { //int check[45]; 로 만들고 for 루프로 1~45 싹 다 집어넣을 수 있음, 참고 ★
		int[] check = new int[6];
		int[] lotto = new int[45];
		int y = 1;
		for(int x = 0 ; x<lotto.length ; x++) {
			lotto[x] = y;
			y++;
		}
		//int[] lotto = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		int i = 0;
		while (i < 6) {
			int j = lotto[(int)(Math.random()*45+1)];
			check[i] = j;
			for(int k=0;k<check.length;k++) {
				if (check[k] == j) {
					continue;
				}
			}
			i++;
			System.out.print(j + "\t");
		}
	}
	
	private static void problem05() {
		int scoreboard[][] = {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}	
		};
		
		int sum = 0;
		int avg = 0;
		int num = 0;
		
		for(int i = 0 ; i<scoreboard.length ; i++) {
			for(int j = 0 ; j<scoreboard[i].length ; j++) {
				if(scoreboard[i][j]>=85) {
					sum += scoreboard[i][j];
					num++;
				}
				
			}
		}
		avg = sum/num;
		System.out.println("85점 이상인 학생들의 점수의 총 합: " + sum);
		System.out.println("85점 이상인 학생들의 점수의 평균: " + avg);
	}
}
