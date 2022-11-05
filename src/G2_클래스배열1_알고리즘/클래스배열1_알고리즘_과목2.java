package G2_클래스배열1_알고리즘;

import java.util.Scanner;


/*
class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}
 */
public class 클래스배열1_알고리즘_과목2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String studentSample = "1001/이만수\n";
		studentSample += "1002/김철만\n";		
		studentSample += "1003/오수정\n";
		
		String subjectSample = "";
		subjectSample += "1001/국어/100/0\n";
		subjectSample += "1001/수학/32/0\n";
		subjectSample += "1002/국어/23/0\n";
		subjectSample += "1002/수학/35/0\n";
		subjectSample += "1002/영어/46/0\n";
		subjectSample += "1003/수학/60/0";
		
		//문제1) 위 샘플문자열들을 각각 해당 클래스배열에 저장후 출력		
		//문제1) 점수가 59점이하인 과목은 전부 삭제후 다시 문자열로 저장후 출력 
		

		Student[] stList = null;
		int stSize = 0;
		
		Subject[] subList = null;
		int subSize = 0;
		
		String[] token = studentSample.split("\n");
		stSize = token.length;
		stList = new Student[stSize];
		
		
		
		for(int i = 0; i < stSize; i++)
		{
			stList[i] = new Student();
			
			String[] token2 = token[i].split("/");
			
			stList[i].number = Integer.parseInt(token2[0]);
			stList[i].name = (token2[1]);
			
		}
		
		for(int i = 0; i < stSize; i++)
		{
			System.out.print(stList[i].number + " ");
			System.out.println(stList[i].name);
			
		}
		
		System.out.println("----------------------");
		
		String[] to = subjectSample.split("\n");
		subSize = to.length;
		subList = new Subject[subSize];
		
		for(int i = 0; i < subSize; i++)
		{
			subList[i] = new Subject();
			
			String[] to2 = to[i].split("/");
			
			subList[i].studentNumber = Integer.parseInt(to2[0]);
			subList[i].subject = to2[1];
			subList[i].score = Integer.parseInt(to2[2]);
			subList[i].rank = Integer.parseInt(to2[3]);
		}
		
		for(int i = 0; i < subSize; i++)
		{
			System.out.print(subList[i].studentNumber + " ");
			System.out.print(subList[i].subject + " ");
			System.out.print(subList[i].score + " ");
			System.out.println(subList[i].rank);
		}
		
		
		
	}

}
