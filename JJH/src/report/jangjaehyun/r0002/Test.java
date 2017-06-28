package report.jangjaehyun.r0002;

public class Test {

	public void printMultipleTable(int initNum, int maxNum) {
		for (int i = initNum; i < -maxNum; i++) {
			int a = 1;
			for (a = initNum; a <= maxNum; a++) {
				System.out.print(a + " X " + i + " = " + (i * a + " , "));
			}
			System.out.println(i + " X " + a + " = " + (i * a));
		}

	}
}
// for(int i=1;i<=9;i++){
// int a = 1;
// for(a = 1;a<=8;a++){

// System.out.print(a + " X " + i + " = " + (i * a + " , "));

// System.out.println(i + " X " + a + " = " + (i * a));
