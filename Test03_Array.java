package com.ssafy.startcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Test03_Array {
	static void arrPrint(int arr[]) {
		
	}
	
	// 배열 복사
	// 얕은 복사(주소 공유), 깊은 복사(값)
	static void check05() {
		int[] arr1 = {1, 2, 3};
		
		// clone 복사
		int[] arr2 = arr1.clone();
		
		// copyOfRange : 시작점을 줘서 깊은 복사
//		int[] arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);
		
		// copyOf : 한번에 복사(깊은 복사)
		// arr1 배열을 복사해서 새로운 배열을 넘겨준다. 2번째 파라미터 = 새로 생성할 배열 길이
//		int[] arr2 = Arrays.copyOf(arr1, arr1.length * 2);
		
		
		// 배열 복사(깊은 복사) - arraycopy : 시작점 정해주고 싶을 때
		/* int[] arr2 = new int[arr1.length];
		 * System.arraycopy(arr1, 0, arr2, 0, arr1.length); */
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// 깊은 복사
		/*
		 * int[] arr2 = new int[arr1.length]; for(int i = 0; i < arr1.length; i++) {
		 * arr2[i] = arr1[i]; } System.out.println(Arrays.toString(arr1));
		 * System.out.println(Arrays.toString(arr2));
		 */
		
		// 얕은 복사
		/*
		 * int[] arr2 = arr1;
		 * 
		 * System.out.println(Arrays.toString(arr1));
		 * System.out.println(Arrays.toString(arr2));
		 * 
		 * arr1[1] = 100; System.out.println(Arrays.toString(arr1));
		 * System.out.println(Arrays.toString(arr2));
		 */
	}
	
	// 배열의 요소를 확인하는 방법
	static void check04() {
		int[] arr = {1, 10, 100};
		
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); } // 1.5
		 * 부터 for(int val : arr) { System.out.println(val); }
		 */
		
		// 배열에 들어간 요소를 확인만 할 때 : toString
		System.out.println(Arrays.toString(arr));
		
		// 1.8 스트림
		Arrays.stream(arr).forEach(System.out :: println);
	}
	
	static void check03() {
		int[] arr = new int[] {1, 10, 100};
		int[] arr2 = new int[3];
		int[] arr3 = {1, 10, 100};
		
		int[] ary = {1, 10, 100};
		arrPrint(ary);
		
//		arrPrint({1, 10, 100}); // 배열의 선언과 함께만 사용 가능하다. 에러발생
		arrPrint(new int[] {1, 10, 100}); // 한번만 사용하는 경우? 변수에 넣지 않고 사용 가능
	}
	
	static void check02() {
		// 배열을 생성하는 시점에 배열에 입력되는 값들이 정해져 있는 경우
		int[] arr = {1, 10, 100}; // 배열 선언시에만 사용 가능.
		
		/*
		 * int[] arr = new int[3];
		 * arr[0] = 1;
		 * arr[1] = 10;
		 * arr[2] = 100;
		 */
	}
	
	// 배열의 생성과 초기화
	static void check01() {
		// 배열 생성
		int[] arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 이름[인덱스] = 값;
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 100;
		
		// 배열의 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
		
		String[] arr2 = new String[3];
		System.out.println(arr2[0]);
	}
	
	public static void main(String[] args) {
		
//		check01();
//		check02();
//		check03();
//		check04();
		check05();	
	}
}
