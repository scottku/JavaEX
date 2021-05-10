package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 -> int 값 설정
		Box intBox = new Box();
		intBox.setContent(2021); // intBox.setContent(Integer.valueOf(2021));
		
		// 값 추출
		int retVal = (int)intBox.getContent(); //반환값이 'Object'이므로 int로 다운캐스팅
		System.out.println("내용물 : " + retVal);
		
		// Box 생성 -> String 값 설정
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println("내용물 : " + strVal);
		
		// 잘못된 캐스팅 예시
		// strVal = (String)intBox.getContent();
		// 1. Object를 다룰 수 있는 클래스 생성 시 
		//	- 캐스팅을 해야 하는 불편함
		// 	- 캐스팅 오류를 컴파일 타임에서 체크 불가능 (실행 해봐야 가능)
	}

}
