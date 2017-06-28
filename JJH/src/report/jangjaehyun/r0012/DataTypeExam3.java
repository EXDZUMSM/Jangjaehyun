package report.jangjaehyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam3 {
	public static void main(String[] args){
		ArrayList<HashMap> numList = new ArrayList<HashMap>();
		
		HashMap hm = new HashMap();
		hm.put(" 번호 ", "1");
		hm.put(" 제목 ", " 게시물1");
		hm.put("작성자", " 홍길동 ");
		
		HashMap hm1 = new HashMap();
		hm1.put(" 번호 ", "2");
		hm1.put(" 제목 ", " 게시물2");
		hm1.put("작성자", " 길정이 ");
		
		HashMap hm2 = new HashMap();
		hm2.put(" 번호 ", "3");
		hm2.put(" 제목 ", " 게시물3");
		hm2.put("작성자", " 윤정이 ");
		
		for(int i = 0; i<numList.size();i++){
			HashMap resultHm = numList.get(i);
			System.out.println(resultHm.get("번호"));
			System.out.println(resultHm.get("제목"));
			System.out.println(resultHm.get("작성자"));
		}
		
	}
}
