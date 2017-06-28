package report.jangjaehyun.r0013;

public class plus implements InterfaceExam{
	
	@Override
	public String getString() {
		return " Test의 getString() 함수 호출 !! " ;
		
	}
	@Override
	public void setString(String str) {
		System.out.println(" Test의 SetStrng() 함수 호출 !! " + str);
	}
	
	public int cal(int a, int b){
		return a+b;
	}
	
//	public int getInt(){
//		System.out.println( " Exam의 getInt() 함수 호출!! ");
//		return 0;
//	}
//	
//	public void setInt(int str){
//		System.out.println(" Exam의 setInt() 함수 호출!!" + str);
//	}
//	
}
