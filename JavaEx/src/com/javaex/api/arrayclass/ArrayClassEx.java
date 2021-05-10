package com.javaex.api.arrayclass;

import java.util.Arrays;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
		sortEx();
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
		
		nums = new int[] {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		// Arrays.sort(nums, Collections.reserseOrder());
		
	}
	
	// 배열 내 검색
	private static void searchEx() {
		
	}

}
