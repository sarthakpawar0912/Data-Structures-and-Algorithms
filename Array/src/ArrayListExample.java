import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>(10);
//		list.add(67);
//		list.add(68);
//		list.add(69);
//		list.add(70);
//		list.add(71);
//		
//		System.out.println(list.contains(66));
//		list.set(0, 80);
//		
//		list.remove(2);
//		System.out.println(list);
//		
		//input
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		
		//get item at any index
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));
		
		}
		System.out.println(list);
	}
}
