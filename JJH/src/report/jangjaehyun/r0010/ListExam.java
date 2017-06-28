package report.jangjaehyun.r0010;

import java.util.ArrayList;
public class ListExam<T> extends ArrayList{

		public static void main(String[] args){
			ListExam<MapExam> list = new ListExam<MapExam>();
			MapExam me = new MapExam();
			me.put(" 1 " , " 2 ");
			
			list.add(me);
			
			return result;
			
			System.out.println(me);
		}
	}


