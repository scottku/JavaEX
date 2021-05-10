package com.javaex.api.stringclass;

public class StringEx {
	public static void main (String[] args) {
		//stringBasic();
		//usefulMethods();
		stringBufferEx();
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
	// 문자열 객체 : 연결, 메서드 수행 시 매번 새 String을 반환 -> 메모리에 문제 발생 가능성
	// StringBuffer : 버퍼(임시 저장 공간) 기반으로 작동 -> 문자열 출력 전까지는 새로운 객체 생성 x
	private static void stringBufferEx() {
		// 버퍼 생성
		StringBuffer sb = new StringBuffer ("This");
		
		// 문자열 추가 : append
		sb.append(" is pencil."); // 현재 문자열 가장 뒤에 해당 내용 추가
		
		// 문자열 삽입 : insert
		sb.insert(7, " my ");
		System.out.println(sb);
		
		// 문자열 치환 : replace
		sb.replace(8, 11, "your");
		System.out.println(sb);
		
		// 버퍼 사이즈 변경
		sb.setLength(10); // 내부 버퍼 크기 10으로 조정
		System.out.println(sb);
		
		//StringBuffer의 메서드들은 연속해서 호출 => 메서드 체이닝
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil.")
				.insert(8, "my")
				.replace(8,10,"your ");
		String s = sb2.toString();
		System.out.println(s);
		
	}
}
