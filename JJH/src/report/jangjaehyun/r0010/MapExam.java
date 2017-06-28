package report.jangjaehyun.r0010;

import java.util.HashMap;



public class MapExam extends HashMap{
	MapExam(){
		
	}
	public String put(String key){
		if(!containsKey(Key)){
			put(key, " test ");
			return " 잘 들어갔어요." ;
		}
		return " 이미 있어 임마 ";
	}
	
	public String toString(){
		String result = "";
		Iterator it = keySet().iterator();
		for(int i = 0; i<keys.size();i++){
			String key = (String)it.next();
			Object value = (Object)get(key);
			result +="[" + key + "," + value + "]";
		}
		return result;
		
		
	}
	public static void main(String[] args){
		MapExam me = new MapExam();
		me.put(" A군 " , 50);
		me.put(" B군 " , 60);
		me.put(" C군 " , 70);
		me.put(" D군 " , 80);
		me.put(" E군 " , 90);
		System.out.println(me);
	}
}
