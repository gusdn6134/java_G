package G2_클래스배열1_기본이론;

class Member{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}

public class 클래스배열1_기본이론1_배열 {

public static void main(String[] args) {
// TODO Auto-generated method stub

		
		// 1)회원 정보가 1개일때
		String data1 = "1001/1234/qwer/김철수/10";	
		
		String[] dataList1 = {"1001", "1234", "qwer", "김철수", "10"};		
		
		Member member = new Member();
		member.number = 1001;
		member.id = "qwer";
		member.pw = "1234";
		member.name = "김철수";
		member.score = 10;
		
		
		//-------------------------------------------------	
		// 2)회원 정보가 2개 이상일때
		String data2 = "";
		data2 +="1001/qwer/1234/김철수/10\n";	
		data2 += "1002/asdf/2345/이영희/30";
		
		String[][] dataList2 ={
			{"1001" , "qwer" ,"1234", "김철수" , "10"},
			{"1002" , "asdf" ,"2345", "이영희" , "30"},
		};	
		
		Member[] memberList = new Member[2];
		
		//System.out.println(memberList[0]);
		//System.out.println(memberList[1]);
		
		Member m1 = new Member();
		m1.number = 1001;
		m1.id = "qwer";
		m1.pw = "1234";
		m1.name = "김철수";
		m1.score = 10;
		memberList[0] = m1;
		
		System.out.println(memberList[0]);
		System.out.println(memberList[0].number);
		System.out.println(memberList[0].id);
		System.out.println(memberList[0].pw);
		System.out.println(memberList[0].name);
		System.out.println(memberList[0].score);
		
		Member m2 = new Member();
		m2.number = 1002;
		m2.id = "asdf";
		m2.pw = "2345";
		m2.name = "이영희";
		m2.score = 30;
		
		memberList[1] = m2;

		System.out.println(memberList[1]);
		System.out.println(memberList[1].number);
		System.out.println(memberList[1].id);
		System.out.println(memberList[1].pw);
		System.out.println(memberList[1].name);
		System.out.println(memberList[1].score);
	}

}
