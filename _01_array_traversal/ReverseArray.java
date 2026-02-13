package _01_array_traversal;

import java.util.*;

public class ReverseArray {
	public static void reverseArray(int[] array) {
		if(array==null || array.length==0) return;
		int temp,len=array.length;
		if(len<=1) {
			System.out.println(Arrays.toString(array));
			return;
		}
		for(int i=0;i<(len)/2;i++) {
			temp=array[i];
			array[i]=array[len-i-1];
			array[len-i-1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
