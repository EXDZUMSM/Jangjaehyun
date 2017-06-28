package report.jangjaehyun.r0004;

public class Exam4{
	int a = 0;
	int b = 0;
	int result = 0;
	public Exam4(){
	}
	public Exam4(int a, int b){
		this.a = a;
		this.b = b;
		this.result = this.a + this.b;
		int c = 1;
	}
	public static void main(String[] args){
	Exam4 e = new Exam4(1,2);
	e.b = 4;
	System.out.println(e.result);
	
	Exam4 e2 = new Exam4(2,2);
	System.out.println(e2.result);
	}
}