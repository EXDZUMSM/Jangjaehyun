package report.jangjaehyun.r0002;

public class ArrayExam2 {
	public static void main(String[] args){
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i] = (i+1);
		}
	a[0]=3;
	a[1]=4;
	a[5]=11;
	
	System.out.println(" a의 첫번째 값 : " + a[0]);
	System.out.println(" a의 마지막 값 : " + a[a.length-1]);
	}
}
