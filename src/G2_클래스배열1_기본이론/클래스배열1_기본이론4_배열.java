package G2_클래스배열1_기본이론;

import java.util.Arrays;

/*
class Member{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}
 */
public class 클래스배열1_기본이론4_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "";
		data += "1001,qwer,1234,김철민,10\n";
		data += "1002,asdf,2345,우중현,3\n";
		data += "1003,zxcv,3456,이만수,30";
				
		System.out.println(data);
		String [] tokens = data.split("\n");
		System.out.println(Arrays.toString(tokens));
		
		
		// 위 데이터를 클래스 배열에 넣고 1등 이름출력 

		int size = tokens.length;
		
		Member[] memberList = new Member[size];
		
		
		for(int i = 0; i < size; i++)
		{
			String[] token2 = tokens[i].split(",");
			
			memberList[i] = new Member();
			memberList[i].number = Integer.parseInt(token2[0]);
			memberList[i].id = token2[1];
			memberList[i].pw = token2[2];
			memberList[i].name = token2[3];
			memberList[i].score = Integer.parseInt(token2[4]);		
		}
		
		
		
		int max = memberList[0].score;
		
		String name = memberList[0].name;
		
		for(int i = 0; i < memberList.length; i++)
		{
			if(memberList[i].score > max)
			{
				max = memberList[i].score;
				name = memberList[i].name;
			}
		}
		
		System.out.println(name);
	}

}
