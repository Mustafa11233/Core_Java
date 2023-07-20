package in.ashokit.Java8;

import java.util.ArrayList;
import java.util.Collections;

// without lambda
public class NumberSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("===========");
		
		for(int i : al) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		al.forEach(i -> System.out.println(i));
		
		
		
		System.out.println("Before Sort : " + al);
		
		//Collections.sort(al, new NumberComparator());
		
		//Collections.sort(al, (i,j) -> i.compareTo(j));
		
		Collections.sort(al, (i,j) -> (i>j) ? -1 : 1);
		
		System.out.println("Affter Sort " + al);
		
		
		
	}

}

//	class NumberComparator  implements Comparator<Integer>{
//	
//		@Override
//		public int compare(Integer i, Integer j) {
//			
//			if(i > j) {
//				return -1;
//			}else if(i<j){
//				return 1;
//				
//			}
//			return 0;
//		
//		}
//		
//	}