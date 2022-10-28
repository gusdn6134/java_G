package G1_클래스_기본이론;

/*
 * 1. 변수
 * 		- 값 1개 저장
 * 2. 배열
 * 		- 같은 타입의 값 여러개 저장
 * 3. 클래스
 * 		- 여러 종류의 데이터를 여러개 저장
 * 
 */

/*
 * # 클래스
 * 1. 정의(설계도)
 * 	1) class	: 키워드
 * 	2) Ex01		: 클래스명
 * 	3) {}		: 자료형의 영역(기본 자료형을 조합해 생성)
 * 2. 선언
 * 	1) 자료형	 변수명  = new 자료형();	
 *  2) Ex01  e    = new Ex01(); 
 */

/*
 * [클래스] 
 * 	1. 내가 직접 자료형을 설정한 배열 : 기존자료형을 조합해서 만든다.
 * 	2. 데이터 : 이름 , 아이디 , 비밀번호 , 번호 , 점수 
 *  3. 순서 : 
 *       (1) 정의 : 내용정의   ==>  class{ 이안에 한다. }
 *  	 (2) 선언 : 데이터 할당 ==>  클래스명 변수명 = new 클래스명();
 *  	 (3) 사용 : 변수명 + . 을 이용해서 사용한다. 
 */

// [1]클래스 설계
class Data{
	String name;
	String id;
	String pw;
	int number;
	int score;
}

// 다음 예제에서 진행 예
class Test01{
	int x;
	int y;
}

public class 클래스1_기본이론1_클래스1 {
public static void main(String[] args) {
						
		// 클래스 사용 전
		String [] data = {"김철수" , "qwer" , "1234" , "1" , "30"};		
		int number = Integer.parseInt(data[3]);	
		System.out.println(number);	
		int score = Integer.parseInt(data[4]);
		System.out.println(score);
		
		System.out.println("------------");
		
		// [2]클래스 사용 
		// (1)객체(instance) (2)속성(property) (=클래스 안에 있는 변수)
		Data cData = new Data(); // 데이터 할당 
		//			------------>> 객체(instance)
		cData.name = "이만수";
		cData.pw = "2345";
		cData.id = "asdf";
		cData.number = 2;
		cData.score = 54;
		
		System.out.println(cData.name);
		System.out.println(cData.pw);
		System.out.println(cData.id);
		System.out.println(cData.number);
		System.out.println(cData.score);
		
	}

}
