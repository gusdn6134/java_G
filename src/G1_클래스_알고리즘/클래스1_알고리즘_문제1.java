package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test04
{
	int hakbuns[] = { 1001, 1002, 1003, 1004, 1005 };
	int scores[] = new int[5];
}
public class 클래스1_알고리즘_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
		
		
		Test04 t4 = new Test04();
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = t4.scores.length;
		int total = 0;
		int count = 0;
		int maxScore = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < size; i++)
		{
			int r = ran.nextInt(100)+1;
			
			t4.scores[i] = r;
			
			total += t4.scores[i];
			
			if(t4.scores[i] >= 60)
			{
				count ++;
			}
			
			if(maxScore < t4.scores[i])
			{
				maxScore = t4.scores[i];
				maxIndex = i;
			}
		}
		
		int avg = total / size;
		
		System.out.println(Arrays.toString(t4.scores));
		System.out.println("총점 = " + total + " 평균 = " + avg);
		System.out.println("합격생 수 = " + count);
		
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println(t4.scores[index]);
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
	
		for(int i = 0; i < size; i++)
		{
			if(score == t4.scores[i])
			{
				System.out.println("인덱스 = " + i);
			} 
		}
		

		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		index = -1;
		
		for(int i = 0; i < size; i++)
		{
			if(hakbun == t4.hakbuns[i])
			{
				index = i;
				break;
			}
		}
		
		if(index == -1)
		{
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		else
		{
			System.out.println("성적 = " + t4.scores[index]);
		}
		
		
		System.out.println(t4.hakbuns[maxIndex] + "번 " + t4.scores[maxIndex] + "점");
	}

}
