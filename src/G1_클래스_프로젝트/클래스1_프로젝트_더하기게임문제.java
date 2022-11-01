package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;

class GamePlus{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}



public class 클래스1_프로젝트_더하기게임문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		* # 더하기 게임
		* 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
		* 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
		* 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
		*/
		
		
		
		Random ran = new Random();
		
		GamePlus g = new GamePlus();
		
		
		for(int i = 0; i < g.game.length;)
		{
			int r = ran.nextInt(10)+1;
			
			boolean check = false;
			
			for(int j = 0; j < i; j++)
			{
				if(g.game[j] == r)
				{
					check = true;
					break;
				}
			}
			
			if(check == false)
			{
				g.game[i] = r;
				i ++;
			}
		}
		
		System.out.println(Arrays.toString(g.game));
	}

}
