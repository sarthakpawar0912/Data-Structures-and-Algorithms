import java.util.Arrays;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= new int[5];
//		arr[0]=23;
//		arr[1]=45;
//		arr[2]=46;
//		arr[3]=48;
//		arr[4]=29;
//		System.out.println(arr[3]);
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		
//		for(int num:arr) {
//			System.out.println(num+"");
//		}
		
		String[] str=new String[4];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		System.out.println(Arrays.toString(str));
	}
}
