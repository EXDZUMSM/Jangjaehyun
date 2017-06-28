package report.jangjaehyun.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	public static void main(String[] args){
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(1);
//		System.out.println(i1.equals(i2));
//		
//		Integer i3 = 1;
//		Integer i4 = 1;
//		System.out.println(i3==i4);
		
		ArrayList<String> arrList = new ArrayList<String>();
		for(int i = 0; i<=10; i++){
			arrList.add("a" + i);
		}
		Collections.sort(arrList);
		
		for(int i = 0; i<arrList.size();i++){
			System.out.println(arrList.get(i));
		}
//		for(int i = 0; i<=arrList.size();i++){
//			System.out.println(arrList.get(i));
//		}
		
	}
}
