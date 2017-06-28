package report.jangjaehyun.r0007;

import java.util.Scanner;

public class Exam9 {
	private int a;
	private int b;
	private int result;
	Scanner scan;
	
	public Exam9(){
		scan = new Scanner(System.in);
		System.out.println(" 초기 값을 입력해주세요 => ");
		this.a = Integer.parseInt(scan.nextLine());
		System.out.println(" 맥스 값을 입력해주세요 => ");
		this.b = Integer.parseInt(scan.nextLine());
		 
	}
	public void doLoop(){
		for(int i=a;i<=b;i++){
			result += i;
			
		}
	}
	public int getResult(){
		return result;
	}
}
