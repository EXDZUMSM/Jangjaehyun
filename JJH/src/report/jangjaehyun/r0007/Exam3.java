package report.jangjaehyun.r0007;

import report.jangjaehyun.r0006.RExam2;

public class Exam3 {
	//r0006 패키지에 있는 RExam2 의 변수 값을 변환하고 출력해주세요.
	// 단 RExam2의 변수의 접근 제어자를 바꾸시면 안됩니다.
	// 함수를 선언하여 해당 문제를 풀어주시기 바랍니다.
	public static void main(String[] args){
		RExam2 re2 = new RExam2();
		System.out.println(re2.getA());
		System.out.println(re2.getB());
		re2.setA(3);
		re2.setB(4);
		System.out.println(re2.setA);
		System.out.println(re2.setB);
	}
	
}
