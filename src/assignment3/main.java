package assignment3;
import java.util.*;
public class main {

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
