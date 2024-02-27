package t01;

public class Test5 {
	public static void main(String[] args) {
		int su = 30;
		System.out.printf("숫자: %d\n", su);
		
		int su2 = 50;
		System.out.println("숫자2: " + su2);
		
		int su3, su4;
		su3 = 10;
		su4 = 20;
		System.out.println("su3: " + su3 + ", su4: " + su4);
		
		int su5 = 5, su6 = 6;
		System.out.println("su5: " + su5 + ", su6: " + su6);
		
		int _su7 = 100, $su8 = 200, su$9 = 300, main = 400; //public = 500; 예약어 변수로 사용 금지
		System.out.println("_su7: "+ _su7 + ", $su8: " + $su8 + ", su$9: " + su$9 + ", main: " + main);
		
		int su10, su11; //사용하지 않는 변수는 선언하지 않는 것이 좋음
		su10 = 50;
		//su11 = 60; //변수 지정을 해주고 사용하지 않으면 메모리만 할당됨
		//su10 = su10 + su11; //초기화되지 않은 변수는 사용할 수 없음
		System.out.println("su10 : " + su10);
		//자바에서는 constant라는 예약어가 있기 때문에 초기값(숫자에서는 상수)는 literal로 표현됨
		
	}
}
