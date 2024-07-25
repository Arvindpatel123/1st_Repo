package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		
              List<Integer>  data =   Arrays.asList(10,20,21,30,40,33);		
		
                  List<Integer> val=  data.stream().filter(n->n%2==0).collect(Collectors.toList());
                   System.out.println(val);
                        
                        
                        
	}

}
