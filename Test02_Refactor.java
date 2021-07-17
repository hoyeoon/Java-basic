package com.ssafy.startcamp;

import java.util.Scanner;

public class Test02_Refactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		System.out.println(num + "은 " + (num % 2 == 0 ? "짝수" : "홀수") + "입니다.");
		
		System.out.printf("%d은 %s입니다.%n", num, num % 2 == 0 ? "짝수" : "홀수");
		
		System.out.println("월(1 - 12) : ");
		int month = sc.nextInt();
		String season ="";
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		}
		System.out.println(season + "입니다.");
	}
}
