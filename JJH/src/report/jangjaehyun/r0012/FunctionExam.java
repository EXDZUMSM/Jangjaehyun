package report.jangjaehyun.r0012;

import java.util.Scanner;

public class FunctionExam {
	int[] arrNum = new int[5];
	Scanner scan = new Scanner(System.in);

	int getNumberFromString() {
		return Integer.parseInt(scan.nextLine());
	}

	public static void main(String[] args){
		FunctionExam ee2 = new FunctionExam();
		
		for(int i = 0; i<ee2.arrNum.length; i++){
			try{
				System.out.println(" 숫자를 넣어주세요. ");
				ee2.arrNum[i] = ee2.getNumberFromString();
			}catch(Exception e){
				i--;
				System.out.println(" 누가 문자 넣으래!! ");
		}
	}
}
}
