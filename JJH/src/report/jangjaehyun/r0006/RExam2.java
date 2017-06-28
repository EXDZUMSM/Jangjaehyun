package report.jangjaehyun.r0006;

public class RExam2 {
	protected int a = 1;
	protected int b = 2;
	
	public void setA(int a){
		this.a = a;
		
	}
	public void setB(int b){
		this.b = b;
	}
	
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public void printA(int a){
		System.out.println(a);
		this.a = a;
		
	}
	
	public void printB(int b){
		System.out.println(b);
		this.b = b;
	}
}
