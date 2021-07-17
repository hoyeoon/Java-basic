/*
 * 변수의 타입에 따른 구분
 * - 기본형(8가지)
 * 	: 논리(boolean) - true, false
 *  : 문자(char) - 한글자, '문자', "a" - X(문자열),
 *    char c = 'a';
 *    char c = 97; // 'A' - 65
 *    char c = '\u0061'; 유니코드
 * 
 *  : 숫자(정수 - byte, short, int, long, 실수 - float, double)
 *  100(int), 1.1(double) - default값
 *  
 *  float f = 1.1; 에러발생
 *  float f = 1.1f;
 *  float f = 1.1F;
 *  
 *  long l = 100l; 권장하지 않음. 소문자 l이 숫자 1과 비슷하므로 대문자 L권장
 *  long l = 100L;
 *    
 * - 참조형
 * 
 * 변수의 선언되는 위치에 따른 분류
 * - 멤버변수(전역), instance
 *  : static이 붙은 변수 : 클래스변수(클래스당 하나의 변수 공간이 생성), Method Area(Class Area) - 공용영역
 *  : static이 붙지 않은 변수(non static) : 인스턴스변수(인스턴스당 하나의 변수 공간이 생성), Heap - 독립영역
 *  : 변수의 값의 자동 초기화 진행됨
 *  
 *  cf. 클래스 로딩 - 객체 생성시 JVM Stack에서 미리 CLASS 정보를 알아야 하기 때문에, Method Area에 클래스가 들어가야하는 과정이 필요하다. 이를 클래스 로딩이라고 한다.
 *  
 *  객체생성후 변수로 static 변수 접근 가능(ex. d.val1). But 권장하지 않음. 왜냐하면 JVM Stack(객체생성) -> Heap(인스턴스변수 영역) -> Method Area 과정을 거침.
 *  반면에 클래스 이름으로 접근(Dog.val1)하면  Method Area 로 바로 접근가능.
 *  
 * - 로컬변수(지역), 
 *  : 블록단위 사용 범위 지정됨
 *  : 값의 초기화가 발생하지 않는다.
 *  
 */

package com.ssafy.startcamp;

public class Test01_Variable {
	// 메서드 밖에 선언되는 변수(멤버변수)
	int val1; // 1
	String val2; // 2
	static int sVal; // 3
	
	// 인스턴스 메소드 영역
	void test() {
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(sVal);
	}
	
	// 인스턴스 메소드 영역
	void test2() {
//		int val;
//		System.out.println(val); // 로컬변수는 값의 초기화가 발생하지 않는다. The local variable val may not have been initialized.
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(sVal);
	}
	
	// 지역 변수의 범위는 블록단위
	void test02() {
		{
			int j = 10;
			System.out.println();
		}
		{
			int j = 10;
			System.out.println();
		}
	}
	
	void test03() {
		/*
		 * 산술연산자의 규칙
		 * <int 보다 같거나 작은 타입> <산술연산자> <int 보다 같거나 작은 타입> = int 
		 * int 보다 같거나 작은 타입 : byte(1), short(2), int(4), char(2 <- 양수) 이 경우 int가 된다.
		 * 
		 * <double> <산술연산자> <int> = double
		 * 
		 */
		
		System.out.println('a' + 1); // char가 int로 바뀐 후 연산된다. 따라서 98
		// ASCII 'a' : 97, 'A' : 65, '0' : 48
		System.out.println('a' + '1'); // 97 + 49 char + char = int
		System.out.println(5 / 2); // 2  int / int = int
		System.out.println((double)5 / 2); // 2.5 <- double / int = double 
		System.out.println((double)(5 / 2)); // 2.0 (double)(int / int)
		
		int tot = 10 * 500;
		if(tot > 3000) {
//			tot = tot * 0.9; // 오류 발생 이유 : int = double <- 캐스팅 에러
//			tot = (int)(tot * 0.9); // 형변환을 이용한 해결
			tot *= 0.9; // 배정 연산을 쓰면 위와 같이 바뀐다. 형변환을 자동으로 해준다.
		}
	}
	
	
	public static void main(String[] args) {
//		// 메서드 내에 선언되는 변수(로컬변수)
////		System.out.println(val1); // 불가
////		System.out.println(val2); // 불가
//		System.out.println(sVal);
//		
//		// static 영역에서 instance 영역의 변수를 접근
//		Test01_Variable tv = new Test01_Variable();
//		System.out.println(tv.val1);
//		System.out.println(tv.val2);
		
		System.out.println('a' + 1); // char가 int로 바뀐 후 연산된다. 따라서 98
		// ASCII 'a' : 97, 'A' : 65, '0' : 48
		System.out.println('a' + '1'); // 97 + 48 char + char = int
		System.out.println(5 / 2); // 2  int / int = int
		System.out.println((double)5 / 2); // 2.5 <- double / int = double 
		System.out.println((double)(5 / 2)); // 2.0 (double)(int / int)
		System.out.println(5d / 2); // 2.0 (double)(int / int)
		System.out.println(5 / 2D);
		
		
	}	
}




