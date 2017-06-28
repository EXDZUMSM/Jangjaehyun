package report.jangjaehyun.r0007;

import java.util.Scanner;

public class ArrExam2 {

	//Scanner 클래스의 nextLine()함수를 사용하여 초기값과 맥스갔을 입력받아주세요.
	// 위에서 받은 초기값부터 맥스값까지 반복하는 반복문 작성.
	// 스트링 배열변수를 선언.
	// 해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러 X
	// 해당 반복문에서 Scanner클래스의 nextLine()함수를 사용하여 위에서 선언한
	// 스트링 배열 변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
	// 다음 반복문에서 스트링배열변수가 가진 모든 방의 값을 출력해주세요.
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String initNum = scan.nextLine();
		int num1 = Integer.parseInt(initNum);
		String MaxNum = scan.nextLine();
		int num2 = Integer.parseInt(MaxNum);
		
		String[] arrStr = new String[(num2 - num1) + 1];
		
		for(int i = 0; i<arrStr.length; i++){
			a[i - num1] = scan.nextLine();
		}
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a + " , ";
			}
	}
}
