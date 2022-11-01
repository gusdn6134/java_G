package G2_클래스배열1_기본이론;

import java.util.Scanner;

/*
class Member{
	int number; 
	String id; 
	String pw; 
	


}
 */

public class 클래스배열1_기본이론5_배열_컨트롤러 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 100;
		Member[] memberList = new Member[max];
		
		// 클래스배열을 이용해서 crud 구현
		int size = 0;
		int num = 1000; // 번호를 1000부터 시작	
		Scanner scan = new Scanner(System.in);	
		
		while(true) 
		{
			System.out.println("[1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력 [0]종료");
			
			int sel = scan.nextInt();
			
			if(sel == 1)
			{
				Member member = new Member();
				member.number = num;
				num += 1;
				System.out.println("아이디 : ");
				member.id = scan.next();
				System.out.println("비밀번호 : ");
				member.pw = scan.next();
				System.out.println("이름 : ");
				member.name = scan.next();
				System.out.println("점수 : ");
				member.score = scan.nextInt();
				memberList[size] = member;
				size += 1;
			}
			
			else if(sel == 2)
			{
				System.out.println("삭제할 아이디 입력 : ");
				String id = scan.next();
				
				int index = -1;
				for(int i = 0; i < size; i++)
				{
					if(id.equals(memberList[i].id))
					{
						index = i;
						break;
					}
					
				}
				
				if(index == -1)
				{
					System.out.println("삭제할 아이디가 없습니다.");
				}
				
				else
				{
					for(int i = index; i < size; i++)
					{
						memberList[i] = memberList[i + 1];
					}
				}
				
				memberList[size - 1] = null;
				size -= 1;

			}
			
			else if(sel == 3)
			{
				System.out.println("수정할 아이디 입력 : ");
				String id = scan.next();
				
				int index = -1;
				
				for(int i = 0; i < size; i++)
				{
					if(id.equals(memberList[i].id))
					{
						index = i;
						break;
					}
					
				}
				
				if(index == -1)
				{
					System.out.println("수정할 아이디가 없습니다.");
				}
				else
				{
					System.out.println("변경할 아이디 입력 : ");
					String id2 = scan.next();
					
					memberList[index].id = id2;
				}
					
				
			}
			
			else if(sel == 5) 
			{
				for(int i = 0; i < size; i++) 
				{
					System.out.println(memberList[i].number + " " + memberList[i].id);
				}
			}
			
			else if(sel == 0)
			{
				break;
			}
		}	

	}

}
