package G2_클래스배열1_기본이론;

/*
class Member{
	int number; 
	String id; 
	String pw; 
	String name;
	 int score;
}
 */
public class 클래스배열1_기본이론2_배열 {
	public static void main(String[] args) {	
		// 클래스 배열은 2차원배열과 비슷한 구조이다.
			int [][] arr = new int[3][]; 
			
			//System.out.println(arr[0]);
			
			arr[0] = new int[3];
			arr[1] = new int[3];
			arr[2] = new int[3];
			
			//System.out.println(arr[0]);
			
			Member [] memberList = new Member[3];
			memberList[0] = new Member();		
			memberList[1] = new Member();	
			memberList[2] = new Member();
			
			//memberList[0].id = "qwer";
			//System.out.println(memberList[0].id);

	}

}
