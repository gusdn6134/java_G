package G1_클래스_기본이론;

class Test02 {
	String name;
	int score;
}

/*
 * 같은 패키지 안의 클래스는 다른 클래스에서 사용할 수 있다.
 * 
 * =
 * 
 * 같은 패키지 내에서는 클래스를 중복해서 사용할 수 없다.
 * 
 */
public class 클래스1_기본이론1_클래스2 {
	public static void main(String[] args) {
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		Test01 e = new Test01();
		e.x = 10;
		e.y = 20;
		
		System.out.println(e.x);
		System.out.println(e.y);
		
		
		System.out.println("--[여러가지자료형을 한클래스에 포함가능하다]--");
		Test02 hgd = new Test02();
		hgd.name = "홍길동";
		hgd.score = 100;

		System.out.println(hgd.name + " " + hgd.score);

	}

}
