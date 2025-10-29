package collection;
import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[]args) {
		ArrayList<String>li=new ArrayList<>();
		li.add("Prahladpur");
		li.add("Udaipur");
		li.add("Delhi");
		System.out.println(li);
		
		li.remove(1);
		System.out.println(li);
	}

}
