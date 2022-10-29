package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

class GameMove
{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class 클래스1_알고리즘_숫자이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 숫자이동[3단계] : 클래스 + 변수
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
		 * 예) 
		 *  0 0 0 0 0 0 0 2 
		 *  왼쪽(1) 오른쪽(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		Scanner scan = new Scanner(System.in);
		
		GameMove s = new GameMove();
		
		int player = 0;
		
		while(true)
		{
			for(int i = 0; i < s.game.length; i++)
			{
				if(s.game[i] == 2)
				{
					player = i; // 캐릭터 위치
					
				}
			}
			
			System.out.println(Arrays.toString(s.game));
			
			System.out.print("[1]왼쪽 [2]오른쪽 [3]벽 격파 = ");
			int sel = scan.nextInt();
			System.out.println();
			
			if(sel == 1)
			{
						
				if(s.game[player -1] == 1)
				{
					
					System.out.println("벽 막힘 이동불가");
					System.out.println("다시 입력해주세요");
					System.out.println();
					
				}
						
				else if(s.game[player - 1] >= 0)
				{
					s.game[player - 1] = 2;
					s.game[player] = 0;
				}
				
			}
			
			if(sel == 2)
			{
				if(s.game[player + 1] == 1)
				{
					System.out.println("벽 막힘 이동불가");
					System.out.println("다시 입력해주세요");
					System.out.println();
					
				}
				
				else if(s.game[player + 1] <= s.game.length)
				{
					s.game[player + 1] = 2;
					s.game[player] = 0;
				}
			}
			
			
			if(sel == 3)
			{
				if(s.game[player - 1] == 1)
				{
					System.out.println("벽을 격파하여 이동합니다");
					s.game[player -1] = 2;
					s.game[player] = 0;
				}
				
				if(s.game[player + 1] == 1)
				{
					System.out.println("벽을 격파하여 이동합니다");
					s.game[player + 1] = 2;
					s.game[player] = 0;	
				}
			}


		}

	}

}
