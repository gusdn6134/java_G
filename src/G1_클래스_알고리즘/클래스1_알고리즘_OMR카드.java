package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Random;

class OMR
{
	int answer[] = {1, 3, 4, 2, 5}; // 시험 답안
	int hgd[] = new int[5]; // 학생 답안
	int count = 0;	// 정답 맞춘 개수
	int score = 0; // 성적
}

public class 클래스1_알고리즘_OMR카드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # OMR카드 : 클래스 + 변수
		 * 1. 배열 answer는 시험문제의 정답지이다.
		 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
		 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
		 * 4. 한 문제당 20점이다.
		 * 예)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * 정오표     = {O, X, O, X, X}
		 * 성적        = 40점
		 */
		
		
		Random ran = new Random();
		
		OMR card = new OMR();
		
		int size = card.hgd.length;
		
		String result[] = new String[size];
		
		for(int i = 0; i < card.hgd.length; i++)
		{
			int r = ran.nextInt(5)+1;
			
			card.hgd[i] = r;
			
			if(card.hgd[i] == card.answer[i])
			{
				card.count ++;
				result[i] = "O";
			}
			
			else
			{
				result[i] = "X";
			}
		}
		
		card.score = card.count * 20;
		
		System.out.println(Arrays.toString(card.answer));
		System.out.println(Arrays.toString(card.hgd));
		System.out.println(Arrays.toString(result));
		System.out.println("성적 = " + card.score + "점");

	}

}
