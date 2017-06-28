package report.jangjaehyun.r0004;

public class lotto {

//	public static void main(String[] args){
//		int random = (int)(Math.random()*45)+1;
//		int[] a = new int[6];
//		
//		for(int i=0; i<6; i++){
//		a[i] = random;
//		
//		for(int j=i+1; j>=0; j--){
//			if(j<6 && a[j]==a[i] && i !=j){
//				j=0;
//				i--;
//			}
//		}
//	
//	for(int i = 0; i<6; i++){
//		System.out.println((i + 1) + " 번째 로또 번호는 : " + a[i]);
//	}
//	}
//	}
	
	public int checkNum(int[] a){
		int random = (int)(Math.random()*45)+1;
		for(int i=0;i<a.length;i++){
			if(a[i]==random){
				random = (int)(Math.random()*45)+1;
				i--;
			}
		}
		return random;
	}
	public static void main(Strhing[] args)
}