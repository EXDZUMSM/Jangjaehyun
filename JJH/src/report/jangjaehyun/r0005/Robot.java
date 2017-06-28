package report.jangjaehyun.r0005;

public class Robot {
	String name;
	int age;
	
	public Robot(String name, int age){
		this.name = " 로보트 ";
		this.age = 3;
	}
	void doKick(){
		//발차기를 하다.
		System.out.println(age + "살 먹은 로봇 " + name + " 이(가) 발차기를 하다. ");
	}
	
	void doRun(){
		//달리기를 하다.
		System.out.println(age + "살 먹은 로봇 " + name + " 이(가) 달리기를 하다. ");
	}
	
	void doChange(){
		//변신을 하다.
		System.out.println(age + "살 먹은 로봇 " + name + " 이(가) 변신을 하다. ");
	}
	
	public static void main(String[] args){
		Robot r = new Robot("asdf",3);
		r.doChange();
		r.doKick();
		r.doRun();
	}
	
}
