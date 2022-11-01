package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GameMemory{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
}

public class 클래스1_프로젝트_기억력게임문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * # 기억력 게임 : 클래스 + 변수
		 * 1. front 배열 카드 10장을 섞는다.
		 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
		 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
		 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
		 */

		
		GameMemory g = new GameMemory();
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < g.front.length; i++)
		{
			int r = ran.nextInt(g.front.length);
			
			int temp = g.front[i];
			g.front[i] = g.front[r];
			g.front[r] = temp;
		}
		
		System.out.println(Arrays.toString(g.front));
		
		
		int count = g.front.length / 2;
		
		while(true)
		{
			System.out.println(Arrays.toString(g.back));
			
			
			if(count == 0)
			{
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("첫 번째 카드 선택 : ");
			int index1 = scan.nextInt();
			System.out.print("두 번째 카드 선택 : ");
			int index2 = scan.nextInt();
			
			if(g.front[index1] == g.front[index2] && g.back[index1] == 0 && g.back[index2] == 0 && index1 != index2)
			{
				g.back[index1] = g.front[index1];
				g.back[index2] = g.front[index2];
			}
			
			else
			{
				System.out.println("틀림");
			}
			
		}
		
		
	}

}
