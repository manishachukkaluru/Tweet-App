package demo3day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(2,3,8,9,7,5,2,1);
		Stream<Integer> S=l.stream();
	S.forEach(a->System.out.println(a));
	l.stream().distinct().sorted().forEach(n->System.out.println(n));
	
	}

}
