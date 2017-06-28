package report.jangjaehyun.r0008;

import java.util.Scanner;

public class Father {
	Scanner scan;
	String str1, str2;
	int initNum, maxNum;

	Father() {
		scan = new Scanner(System.in);
		System.out.println(" 아빠 생성자 호출 ");
		inputFormScanner1();
		inputFormScanner2();
		castStringToInt();
	}
	
	
	void castStringToInt(){
		initNum = Integer.parseInt(str1);
		maxNum = Integer.parseInt(str2);
	}
	void inputFormScanner1() {
		str1 = scan.nextLine();
	}

	void inputFormScanner2() {
		str2 = scan.nextLine();
	}
	void printIWithLoop(){
		for(int i=initNum;i<=maxNum;i++){
			System.out.println(i);
		}
	}
		
}
