package report.jangjaehyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam6 extends DataTypeExam5{

	public HashMap getHashMap(){
		HashMap hm = new HashMap();
		System.out.println("클래스 정보를 입력하세요!!");
		hm.put("클래스", scan.nextLine());
		return hm;
	}
	
	public static void main(String[] args){
		ArrayList<HashMap> alList = new ArrayList<HashMap>();
		DataTypeExam6 dte5 = new DataTypeExam6();
		for(int i=0;i<2;i++){
			alList.add(dte5.getHashMap());
		}
		for(HashMap hm1 : alList){
			System.out.print(hm1.get("클래스") + ",");
			System.out.print(hm1.get("이름") + ",");
			System.out.print(hm1.get("나이") + ",");
			System.out.println(hm1.get("성별"));
		}
	}
}
