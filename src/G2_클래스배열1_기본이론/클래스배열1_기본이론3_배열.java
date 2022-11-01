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

public class 클래스배열1_기본이론3_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] dataList ={
				{"1001" , "qwer" , "1234", "김철수" , "10"},
				{"1002" , "asdf" , "2345", "이영희" , "30"},
			};	
			
			int size = dataList.length;
			Member[] memberList = new Member[size];
			
			
			for(int i = 0; i < size; i++) {
				// 방법(1)
				memberList[i] = new Member();
				memberList[i].number =  Integer.parseInt(dataList[i][0]);
				
				
				
				// 방법(2)
				Member m = new Member();
				m.number = Integer.parseInt(dataList[i][0]);
				m.id = dataList[i][1];
				m.pw = dataList[i][2];
				m.name =  dataList[i][3];
				m.score = Integer.parseInt(dataList[i][4]);
				memberList[i] = m;
			}
			

	}

}
