package collection;
import java.util.*;
public class ArrayListExample2 {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		ArrayList<String>arr=new ArrayList<>();
		System.out.println("Enter a name :");
		
		for(int i=0;i<5;i++) {
			System.out.println("Name "+(i+1)+ ":" );
			String name=src.nextLine();
			arr.add(name);
		}
		System.out.println("\nAll names in ArrayList :");
		System.out.println(arr);
		src.close();
	}

}
