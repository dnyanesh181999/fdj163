import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer>list = new ArrayList<>();
	list.add(10);
	list.add(8);
	list.add(12);
	list.add(9);
	System.out.println(list);
	List<Integer>list1 = new ArrayList<>();
	list1.add(100);
	list1.add(108);
	list1.add(112);
	list1.add(109);
	System.out.println(list1);
	
	List<Integer> list2 = new ArrayList<>();
	list2.addAll(list);
	list2.addAll(list1);
	System.out.println(list2);
	Collections.sort(list2,(a,b)->a<b?-1:(a>b?1:0));
	System.out.println(list2);
	
}
}
