package report.jangjaehyun.r0004;

import java.util.Scanner;

public class CalPoint {

	// Scanner클래스를 사용하여 6명의 학생의 점수를 직접 입력 받기
	// 6명의 학생의 총점을 출력해주세요.
	public static void main(String[] args) {

		
//		 Scanner sc = new Scanner(System.in);
//		
//		 System.out.println(" 1번째 학생의 점수를 입력 해 주세요."); 
//		 String a = sc.nextLine();
//		 System.out.println(" 1번째 점수 : " + a);
//		
//		 System.out.println(" 2번째 학생의 점수를 입력 해 주세요.");
//		 String b = sc.nextLine();
//		 System.out.println(" 2번째 점수 : " + b);
//		
//		 System.out.println(" 3번째 학생의 점수를 입력 해 주세요.");
//		 String c = sc.nextLine();
//		 System.out.println(" 3번째 점수 : " + c);
//		
//		 System.out.println(" 4번째 학생의 점수를 입력 해 주세요.");
//		 String d = sc.nextLine();
//		 System.out.println(" 4번째 점수 : " + d);
//		
//		 System.out.println(" 5번째 학생의 점수를 입력 해 주세요.");
//		 String e = sc.nextLine();
//		 System.out.println(" 5번째 점수 : " + e);
//		
//		 System.out.println(" 6 " + "번째 학생의 점수를 입력 해 주세요.");
//		 String f = sc.nextLine();
//		 System.out.println(" 6번째 점수 : " + f);
//		
//		
//		 int num1 = Integer.parseInt(a);
//		 int num2 = Integer.parseInt(b);
//		 int num3 = Integer.parseInt(c);
//		 int num4 = Integer.parseInt(d);
//		 int num5 = Integer.parseInt(e);
//		 int num6 = Integer.parseInt(f);
//	
//		 System.out.println(" 합산 점수 : " + (num1 + num2 + num3 + num4 + num5 + num6));
//		 System.out.println(" 평균 점수 : " + (num1 + num2 + num3 + num4 + num5 + num6)/6);
	
		 for(int i = 0;i<num.length;i++){
			for(int j = i + 1;j<num.length;j++){
				if(num[i]<num[j]){
					int tmp = num[i];
					num[i] = num[i];
					num[i] = tmp;
				}
			}
			
			 }
		 }
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		int[] num = new int[5];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println((i + 1) + " 번째 학생의 점수를 입력해주세요 = :");
//			String numStr = sc.nextLine();
//			num[i] = Integer.parseInt(numStr);
//			// System.out.println(" 입력하신 + (i+1) + " 번째 학생의 점수 = " + numStr);
//			result += num[i];
//		}
//		System.out.println(" 입력하신 5학생의 점수의 총점 = " + (result));
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("입력하신 " + (i + 1) + " 번째 학생의 점수 = " + num[i]);
//		}
//	}
	}
}
	

