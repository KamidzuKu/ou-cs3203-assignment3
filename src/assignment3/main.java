package assignment3;
import java.util.*;
public class main {
	public static void main(String[] args) {
		
		int[] arr = {3, 4, 5, 6};
		int sum = sum(arr);
		
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length -1;i++) {
			sum+= arr[i];
		}
		return sum;
	}
}
