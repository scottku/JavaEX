package com.javaex.api.stringclass;

public class StringEx {
	public static void main (String[] args) {
		stringBasic();
		usefulMethods();
	}
	
	private static void stringBasic() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 새 객체
		String s3 = "Java";
		
		System.out.println("s1 == s2? : " + (s1==s2)); // 리터럴 vs new
		System.out.println("s1 == s3? : " + (s1==s3)); // 리터럴 vs 리터럴
		
		// valueOf() 메서드 : 기본 타입을 문자열로 리턴
		String s4 = String.valueOf(Math.PI);
		System.out.println("valueOf 메서드: " + s4);
	}
	
	private static void usefulMethods() {
		String str = "Java Programming JavaScript Programming";
		// 길이를 잡을 수 있고, 인덱스 접근이 가능하다.
		System.out.println("Length: " + str.length());
		System.out.println("5번 인덱스의 글자: " + str.charAt(5));
		
		// 변환 메서드
		System.out.println("소문자 변환: " + str.toLowerCase());
		System.out.println("대문자 변환: " + str.toUpperCase());
		
		// 검색 관련 ★
		int idx;
		idx = str.indexOf("Java");
		System.out.println("1번째 검색 : " + idx);
		idx = str.indexOf("Java", idx + 4); // 4단어 이동해서 검색 시작
		System.out.println("2번째 검색 : " + idx);
		idx = str.indexOf("Java", idx + 4); // 4단어 이동해서 검색 시작
		System.out.println("3번째 검색 : " + idx); // 찾는 검색어가 없을 때 -1 반환 ★
		
		// 역방향 검색
		System.out.println("역방향 검색 : " + str.lastIndexOf("Java"));
		
		// 문자열 추출
		System.out.println("substring: " + str.substring(5)); // 5번째 문자열부터 끝까지
		System.out.println("substring: " + str.substring(5,16)); // 5번째 문자열부터 16번째 문자열까지
		
		// 치환
		System.out.println("replace: " + str.replace("Java", "java"));
		
		// 공백문자 제거
		String s2 = "                                     Hello            ";
		String s3 = "      Java                                               ";
		System.out.println(s2.trim() + s3.trim()); // 문자열 앞 뒤 공백들 삭제
		
		// 분할: split
		String[] chunks = str.split(" "); // 공백을 기준으로 문자열 분할
		for (String chunk : chunks) {
			System.out.println("Word: " + chunk);
		}
		
		// 문자열 비교: Unicode 비교
		// 같으면 0, 앞의 것이 작으면(먼저) 음수, 크면(순서 상 뒤) 양수
		System.out.println("ABC".compareTo("ABD"));
		
	}
}
