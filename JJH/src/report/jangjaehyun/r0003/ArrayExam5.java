package report.jangjaehyun.r0003;

public class ArrayExam5 {
	// 자리수가 6개인 인트형 배열변수 a를 선언
	// 총6번 반복하는 반복문에서 
	// 아래에서 나오는 랜덤값을 배열변수 a에 0번째 방부터 차례로 입력하시면 됩니다.
	public static void main(String[] args){
		int[] a = new int[20];
		for(int i=0;i<20;i++){
			int random = (int)(Math.random()*45)+1;
			a[i] = random;
//			System.out.println((i+1) + "번째 로또번호는 : " + a[i]);
			for(int j=i;j>=0;j--){
				if(a[j]==a[i] && i!=j){
					j=0;
					i--;
				}
			}
		}
		for(int i=0;i<20;i++){
			System.out.println((i+1) + "번째 로또번호는 : " + a[i]);
		}
	}
}