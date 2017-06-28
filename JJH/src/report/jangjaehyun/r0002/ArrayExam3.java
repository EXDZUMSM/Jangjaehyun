package report.jangjaehyun.r0002;

public class ArrayExam3 {
	public int[] getArrayVar(int initNum, int maxNum) {
		// initNum 으로 시작해서 maxNum으로 종료되는 반복문을 사용하여
		// 배열변수 a값을 집어넣고 배열변수 a를 출력
		// 출력은 main함수에서 출력
		int[] a = new int[maxNum - initNum];
		for (int i = initNum - initNum; i < maxNum; i++) {
			a[i] = i + 1;
		}

		return a;
	}
	public void printArrayVar(){
	int[] a = new int[3];
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args){
		ArrayExam3 ae3 = new ArrayExam3();
		int[] a = ae3.getArrayVar(0, 5);
		ae3.printArrayVar();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

