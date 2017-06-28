package report.jangjaehyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam4 {

	public static void main(String[] args){
		ArrayList<HashMap> alList = new ArrayList<HashMap>();
		HashMap hm = new HashMap();
		hm.put("클래스", "A");
		hm.put("이름", "홍길동");
		hm.put("나이", "20");
		hm.put("성별", "남자");
		alList.add(hm);
		
		for(HashMap hm1 : alList){
			System.out.print(hm1.get("클래스") + ",");
			System.out.print(hm1.get("이름") + ",");
			System.out.print(hm1.get("나이") + ",");
			System.out.println(hm1.get("성별"));
		}
		
		
	}
}
