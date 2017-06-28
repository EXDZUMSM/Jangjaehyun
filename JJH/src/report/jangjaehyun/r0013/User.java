package report.jangjaehyun.r0013;

public class User {
	private InterfaceExam ie;
	User(String operator){
		if(operator.equals(" + ")){
			ie = new plus();
		}else if(operator.equals( " - ")){
			ie = new minus();
		}
			
	}
	// public static void main(String[] args){
	// InterfaceExam ie = new Exam();
	// InterfaceExam ie2 = new Test();
	//
	// String str = ie.getString();
	// System.out.println(str);
	// String str2 = ie2.getString();
	// System.out.println(str2);
	//
	// InterfaceExam2 ie3 = new Test();
	// int a = ie3.getInt();
	// System.out.println(a);
	// ie3.setInt(a);

	
	User(int a){
		if(a==1){
		ie = new plus();
	}
	
	else{
		ie = new minus();
	}

	}
	public InterfaceExam getInterfaceExam() {
		return ie;
	}
	public static void main(String[] args){
		User u = new User(" + ");
		InterfaceExam ie = u.getInterfaceExam();
		int result = ie.cal(3,4);
		System.out.println(result);
		
		u = new User(" - ");
		ie =u.getInterfaceExam();
		int result1 = ie.cal(3,4);
		System.out.println(result1);
	}

}