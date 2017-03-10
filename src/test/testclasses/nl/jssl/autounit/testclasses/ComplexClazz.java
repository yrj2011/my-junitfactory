package nl.jssl.autounit.testclasses;

import java.util.ArrayList;
import java.util.List;

public class ComplexClazz {

		/*public int getInt(int a){
			if(a > 0)
				return 1;
			else if(a < 0)
				return -1;
			return 0;
		}
		
		public byte getByte(){
			return 1;
		}
		
		public char getChar(){
			return 'a';
		}
		
		public long getLong(){
			return 1L;
		}
		
		public String getString(){
			return "hello world";
		}
		
		public void printf(){
			System.out.println("hello world");
		}
		
		public int setInt(int a){
			if(a > 0)
				return -1;
			if(a < 0)
				return 1;
			return 0;
		}*/
		
		public List<Integer> getList(int a ){
			if(a < 0 )
				throw new RuntimeException();
			List<Integer> intLst = new ArrayList<>();
			for (int i = 0; i < a; i++) {
				intLst.add(i);
			}
			return intLst;
		}
}
