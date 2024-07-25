package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {

        List<Integer> data = Arrays.asList(10,20,30,40,10,20);    // Remove duplicate value
		
		      List<Integer> val= data.stream().distinct().collect(Collectors.toList());
		      
		        System.out.println(val);
		      
	}

}
