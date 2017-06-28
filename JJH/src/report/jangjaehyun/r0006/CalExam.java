package report.jangjaehyun.r0006;

import java.util.Scanner;

public class CalExam {
	//반복문을 사용하여 Scanner클래스를 이용해
	//총 10명의 학생 점수를 받고 
	//10명 학생의 총점과 평균을 구하기 
	
	public static void main(String []args){
		Scanner z = new Scanner(System.in);
		int result = 0;
		int result1 = 0;
		int[] a = new int[10];
		int num = 0;
		for(int i = 0;i<10;i++){
			System.out.print((i+1) + " 번째 점수를 입력 해 주세요. " );
			String inStr = z.nextLine();
			
			num = Integer.parseInt(inStr);
			result += num;
			result1 = result/10;
		}
		System.out.println(" 총 합의 결과는 ? " + result);
		System.out.println(" 평균 점수는 ? " + result1);
	}
	
}
