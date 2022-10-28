package G1_클래스_기본이론;

class Test03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class 클래스1_기본이론1_클래스3 {
	public static void main(String[] args) {

		Test03 t3 = new Test03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		
		int size = t3.arr.length;
		int total = 0;
		int total2 = 0;
		int count = 0;
		int count2 = 0;
		
		for(int i = 0; i < size; i++)
		{
			total += t3.arr[i];
			
			if(t3.arr[i] % 4 == 0)
			{
				total2 += t3.arr[i];
				count ++;
			}
			
			if(t3.arr[i] % 2 == 0)
			{
				count2 ++;
			}
		}
		
		System.out.println(total);
		System.out.println(total2);
		System.out.println(count);
		System.out.println(count2);
	

		
		

	}

}
