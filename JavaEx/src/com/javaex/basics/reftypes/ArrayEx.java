package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		//arrayBasic();
		//multiDimArray();
		//arrayCopyFor();
		arrayCopyByArrayCopy();
	}
	private static void arrayCopyByArrayCopy()	{
		int[] intArray = {1,2,3,4};
		int[] newArray = new int[10];
		
		System.arraycopy(intArray, 0, newArray, 4, intArray.length); // 0~9번째 중 4번째부터 값 대입
		for(int i = 0; i<newArray.length;i++) {
			System.out.print(newArray[i] + "\t");
		}
		System.out.println();
		
		//Enhanced For : 순차 객체로부터 값을 하나씩 추출하여 할당하는 for 구문
		for(int i : newArray) {
			System.out.print(i + "\t");
		} System.out.println();
	}
	
	private static void arrayCopyFor() {
		// 배열은 크기 변경이 안되므로 새 배열을 만들어 복사
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		for(int i = 0; i<source.length; i++) {
			target[i] = source[i];
		}
		for (int i=0; i<target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
	}
	
	private static void multiDimArray() {
		// 2차원 배열 -> new type[행 수][열 수]
		// 3차원 배열 -> new type[행 수][열 수][z축]
		int[][] twoDimen = new int[5][10]; // 5행 10열의 배열
		
		int table[][] = {
				{1,2,3,4,5,6,7,8,9,0}, // 1행
				{2,3,4,5,6,7,8,9,0,1},
				{3,4,5,6,7,8,9,0,1,2},
				{4,5,6,7,8,9,0,1,2,3},
				{5,6,7,8,9,0,1,2,3,4}
		}; //배열의 배열, table.length = 5
		
		// 배열 내부의 모든 값을 합산
		int total = 0;
		
		System.out.println("table 배열의 행 수 : " + table.length); // 행 수
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		System.out.println("총계 : " + total);
		
	}
	
	private static void arrayBasic() {
		//선언과 초기화 사용
		// 선언
		String[] names; // Type 뒤에 []
		int scores[]; // 식별자 뒤에 []
		
		// 초기화
		names = new String[] {"홍길동" , "장길산", "전우치", "임꺽정"};
		
		//배열 생성
		scores = new int[4];
		//인덱스를 이용한 접근 : 0 ~ .length-1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		//scores[4] = 100; Index 4 out of bounds for length 4(0~3), 범위 넘는거 주의
		// 값 목록이 있을 경우
		// 선언과 동시에 할 때만 유효
		float heights[] = {
			175.3f,
			178.2f,
			165.3f,
			188f
		};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i], heights[i], scores[i]);
		}
		//참조 복사
		int scores2[] = scores;
		System.out.println("scores==scores2 : " + (scores==scores2)); //scores과 scores2는 같은 객체 주소
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		//scores2의 값 변경
		scores2[2] = 100;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		} //scores2의 값 변경했는데 score의 값이 변경됨. 주의 ★
	}
	
}
