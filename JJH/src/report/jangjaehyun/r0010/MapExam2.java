package report.jangjaehyun.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam2 extends HashMap{
//HashMap을 상속 받아주세요.
//키 타입은 String, 밸류 타입은 Integer로 선언해주세요.
//키는 아무거나 넣으셔도 되지만 밸류는 반드시 숫자만 입력하셔야 합니다.
//총 10개의 키값을 생성해주세요
//toString() 함수를 오버라이딩 해서 해당 해쉬맵이 가지고 있는 전체 숫자를 더한 값을 출력해주세요.
	
	public String toString(){
		String result = "";
		List<String> keyList = new ArrayList<>(keySet());
		for(int i = 0; i<keyList.size(); i++){
			String key = keyList.get(i);
		}
	
	}
	public static void main(String[] args){
		MapExam2 me2 = new MapExam2();
		for(int i = 1;i<=10;i++){
			me2.put(""+i,i);
		}
		System.out.println(me2);
	}
}
