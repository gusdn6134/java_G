package G1_클래스_기본이론;

class Sample3 {
	int arr[] = { 10, 20, 30, 40, 50 };
}

public class 클래스1_기본이론2_메모리구조4 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5 };

		Sample3 s3 = new Sample3();

		Sample3 temp3 = s3;
		s3 = null;
		
		// 에러가 발생한다.
		// 15번째 줄에서 null로 삭제했기 때문에 새로 new를 하지 않으면 사용할 수 없다.
		
		s3.arr = arr;

	}

}
