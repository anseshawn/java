package t01;
//main메소드 없이 실행할 경우 최근에 사용한 main메소드가 실행됨(이 프로그램x)
public class Test4 {
	public static void main(String[] args) { //main메소드: 실행메소드 void:리턴값 없을 때 사용
	//args: argument, 변수명. 인수, 인자. 앞에 타입이 나와야 함. String: 문자열을 의미 []: 배열
	//args라는 변수를 문자열 배열로 이용할 것이라는 의미
		System.out.println("1.반갑\t습니다."); // \t: 탭, \n: 엔터(줄바꾸기) 삽입
		System.out.print("2.반갑습니다.\n\n"); //ln:줄바꿈 ln을 생략할경우 2번에서 줄을 바꾸지 않겠다는 의미
		System.out.println("3.반갑습니다.");
		
		/*
		  여러줄의 주석처리 경우 엔터 누를 때 * : API이용시 사용함, 지워도 됨
		*/
		System.out.println("4.반갑습니다.");
	}
}
