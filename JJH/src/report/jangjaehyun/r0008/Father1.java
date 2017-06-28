package report.jangjaehyun.r0008;

import java.util.Scanner;

// 아빠 클래스에서 배열변수를 선언하시고 10명 학생의 점수를 입력받아주세요.
// 단 배열변수의 데이터 타입은 int 형이어야 합니다.
// 출력함수는 아빠클래스에서 선언해주시고
// 호출만 아들 클래스에서 해주시기 바랍니다.
public class Father1 {
	Scanner scan;
	String str1, str2;
	int initNum, maxNum;
	int[] arrNum = new int[10];

	Father1() {
		scan = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력해주세요 => ");
		int studentCnt = Integer.parseInt(scan.nextLine());
		arrNum = new int[studentCnt];
		System.out.println(studentCnt + "명 학생의 점수를 입력해주세요!!");
		inputPoint();
	}

	void inputPoint() {
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = Integer.parseInt(scan.nextLine());
		}
	}

	void printPoint() {
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
