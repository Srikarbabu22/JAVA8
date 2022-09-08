package java8feauters.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		
		names.add("sunny");
		names.add("ali");
		names.add("ubeerr");
		names.add("ckrishna");
		
		//i would like to count no.of ele present in list
		//without stream implementation
		
		int count=0;
		for(String ele:names) {
			if(ele.length()<6)
				count++;
		}
			System.out.println("thre are " + count + "string with less than 6");
			
			//lets apply stream now - using lambda expression
			int number=(int)names.stream().filter(ele -> ele.length()<6).count();
			System.out.println("thre are " + number + "string with less than 6");

	}

}
