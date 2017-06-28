package report.jangjaehyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap> alList = new ArrayList<HashMap>();
		for(int i = 0;i<2;i++){
			HashMap hm = new HashMap();
			System.out.println(" 신상정보를 입력하세요!! ");
			hm.put("클래스", scan.nextLine());
			hm.put("이름", scan.nextLine());
			hm.put("나이", scan.nextLine());
			hm.put("성별", scan.nextLine());
			alList.add(hm);
		}
		for(HashMap hm1 : alList){
			System.out.println(hm1.get("클래스") + ",");
			System.out.println(hm1.get("이름") + ",");
			System.out.println(hm1.get("나이") + ",");
			System.out.println(hm1.get("성별") + ",");
		}
	}

}
