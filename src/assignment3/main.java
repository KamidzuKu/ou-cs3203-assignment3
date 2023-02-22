package assignment3;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me array size and numbers");
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sum(arr);
		System.out.println(sum);
		int mult = mult(arr);
		System.out.println(mult);
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length -1;i++) {
			sum+= arr[i];
		}
		return sum;
	}
	public static int mult(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length -1;i++) {
			sum = sum * arr[i];
		}
		return sum;
	}
}
