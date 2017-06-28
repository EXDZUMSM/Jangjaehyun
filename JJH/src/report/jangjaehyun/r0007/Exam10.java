package report.jangjaehyun.r0007;

public class Exam10 {
	// Exam9에 private int a,b,result 선언
	// Exam9 생성자에서 a값과 b값을 Scanner클래스의 nextLine()함수를 사용하여 대입
	// i가 a부터 b까지 도는 반복문을 작성
	// result의 i를 반복문만큼 더하는 함수 작성
	// result의 값을 출력하는 함수를 작성하여 Exam10에서 출력
	public static void main(String[] args){
		Exam9 e9 = new Exam9();
		e9.inputA();
		e9.inputB();
		
		e9.doLoop();
		System.out.println(e9.getResult());
		
	}
}
