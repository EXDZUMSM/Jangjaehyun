package report.jangjaehyun.r0004;

import java.util.Scanner;

public class CalPoint {

	// Scanner클래스를 사용하여 6명의 학생의 점수를 직접 입력 받아 주세요.
	// 6명의 학생의 총점을 출력해주세요.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 학생의 점수를 입력해주세요=>:");
		String numStr1 = scan.nextLine();
		int num1 = Integer.parseInt(numStr1);
		System.out.println("입력하신 1번째 학생의 점수 = " + numStr1);
		

		System.out.println("2번째 학생의 점수를 입력해주세요=>:");
		String numStr2 = scan.nextLine();
		int num2 = Integer.parseInt(numStr2);
		System.out.println("입력하신 2번째 학생의 점수 = " + numStr2);

		System.out.println("3번째 학생의 점수를 입력해주세요=>:");
		String numStr3 = scan.nextLine();
		int num3 = Integer.parseInt(numStr3);
		System.out.println("입력하신 3번째 학생의 점수 = " + numStr3);
		
		System.out.println("입력하신 3학생의 점수의 총점 = " + (num1+num2+num3));
	}
}
