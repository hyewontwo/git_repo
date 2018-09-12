/**
 * 프로그램 소스의 최소 단위 = class
 * 프로그램 시작 클래스 (메인 클래스) --> public class 클래스이름
 * 메인 클래스 이름은 소스파일의 이름과 동일해야 하며, 영어/숫자/언더바(_)만 
 * 사용 가능하다.
 * 첫글자는 반드시 영어로만 구성되어야 한다.
 */
public class Exam1 {
	/**
	 * 프로그램의 시작점 --> main 메소드(함수) 
	 */
	public static void main(String[] args) {
		// 콘솔에 문자열을 출력하기 위한 명령어
		// 문자열을 표현하는 방법 --> 쌍따옴표로 묶는다.
		System.out.println("Hello World!!");
		System.out.print("자바");
		System.out.print("안녕 자바!!");	
		/*
		 * 서식문자
		 * %s : 문자열
		 * %d : 정수
		 * %f : 실수
		 */
		System.out.printf("%s %d %f", "Hello Java!!", 5, 7.7);
	}
}

