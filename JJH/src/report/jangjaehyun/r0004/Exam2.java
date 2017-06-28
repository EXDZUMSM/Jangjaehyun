package report.jangjaehyun.r0004;

public class Exam2 {
//	public void printPlusResult(int a, int b) {
//		System.out.println(" 더한 결과 값 : " + (a + b));
//	}
//
//	public int getPlusResult(int a, int b) {
//		return a + b;
//	}
//
//	 public static void main(String[] args) {
//	 Exam2 e = new Exam2();
//	 e.printPlusResult(1, 3);
//	 int result = e.getPlusResult(1, 3);
//	 System.out.println(" 더한 결과 값 : " + result);
//	 }
//
//	public static void main(String[] args) {
//		Exam2 s = new Exam2();
//		s.printPlusResult(1, 3);
//		int result = s.getPlusResult(1, 3);
//		System.out.println(" 더한 결과  값 : " + result);
//
//	}
	public static void main(String[] args){
		int[] a = new int[5];
		for(int i = 0;i<5;i++){
			a[i] = i+1;
		}
		for(int i=0;i<5;i++){
			System.out.print(" a[" + i + "]= "+ a[i] + ",");
		}
	}



}