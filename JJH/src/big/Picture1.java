package big;

public class Picture1 {
	static int a = 1;
	static int getInt(){
		try{
			int a = Integer.parseInt("str");
			return a;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	public static void main(String[] args){
		Picture1 pic1 = new Picture1();
		int a = pic1.getInt();
	}
}
