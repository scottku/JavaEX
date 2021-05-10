package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
//		sortEx();
//		sortCustomEx();
		searchEx();
	}
	
	private static void printArrayEx() {
		int arr[] = new int[] {
				1,2,3,4,5,6,7,8,9,10
		};
		
		// 출력
		System.out.println("arr[] : " + arr); //I@(주소) <- int의 주소값을 보여줌, 값 x
		
		for (int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		//Arrays.toString();
		System.out.println("arr[] : " + Arrays.toString(arr));
	}
	
	private static void copyArrayEx() {
		int arr[] = new int[] {
				1,2,3,4,5,6,7,8,9,10
		};
		
		int target[] = new int[arr.length];
		// 방법 1. 루프 돌면서 복사
		for (int i = 0 ; i < arr.length ; i++) {
			target[i] = arr[i]; // 복사
		}
		System.out.println("배열 복사(for) : " + Arrays.toString(target));
		
		//방법 2. System 객체 이용하여 복사
		System.arraycopy(arr, // 원본 배열
				0, // 복사 시작 위치(원본 배열) 
				target, // 목적지
				0, // 복사 시작 위치
				arr.length); // 복사할 길이
		
		System.out.println(Arrays.toString(target));
		
		// 방법 3. Arrays.copyOf
		target = Arrays.copyOf(arr, arr.length); //(원본 배열, 복사할 길이)
		System.out.println(Arrays.toString(target));
		
		// 방법 4. Arrays.copyRangeOf(부분 복사)
		target = Arrays.copyOfRange(arr, 5, arr.length); //(원본 배열, 시작, 끝)
		System.out.println("일부 복사(copyOfRange) : " + Arrays.toString(target));
	}
	
	// 정렬
	private static void sortEx() {
		int nums[] = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums); // 정렬
		System.out.println("정렬 : " + Arrays.toString(nums)); // 오름차순 : 기본
		
		Integer nums2[] = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		System.out.println(Arrays.toString(nums2));
		// 내림차순 정렬
		Arrays.sort(nums2, Collections.reverseOrder());
		System.out.println("내림차순 : " + Arrays.toString(nums2));
	}
	
	// 정렬(사용자 정의 클래스)
	private static void sortCustomEx() {
		Member[] members = {
				new Member("홍길동"), new Member("고길동"), new Member("장길산")
		};
		System.out.println("원본 배열 : " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 후 : " + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println("정렬(내림차순) :" + Arrays.toString(members));
	}
	
	// 배열 내 검색
	private static void searchEx() {
		Integer nums2[] = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		// 자바는 기본적으로 이진 검색 (반으로 나눠서 오른쪽에 있는지 왼쪽에 있는지 확인)
		// 이진 검색은 검색 이전에 먼저 배열이 정렬되어 있어야 함. ★
		Arrays.sort(nums2);
		System.out.println("정렬된 원본: " + Arrays.toString(nums2));
		int index = Arrays.binarySearch(nums2, 8);
		System.out.println("8의 index : " + index);
		
		// String 배열의 검색
		String[] str = {"Java" , "C", "C++", "Python", "Linux"} ;
		Arrays.sort(str); // 검색 이전 정렬
		System.out.println("원본 : " + Arrays.toString(str));
		index = Arrays.binarySearch(str,  "Python");
		System.out.println("Pytho의 인덱스 : " + index);
		
		// 사용자 정의 객체의 검색 ★
		Member[] members = {
				new Member("홍길동"), new Member("고길동"), new Member("장길산")
		};
		Arrays.sort(members);
		System.out.println("원본 : " + Arrays.toString(members));
		index = Arrays.binarySearch(members, new Member("홍길동")); //compareTo 메서드로 비교하는 것이므로 비교하는 물체를 동일하게 만들어줘야 함
		System.out.println("홍길동의 index : " + index);
	}

}
