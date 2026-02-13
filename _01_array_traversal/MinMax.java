package _01_array_traversal;

public class MinMax {
	
	public static void minMax(int[] array) {
		if (array==null || array.length==0) return;
		int min=array[0],max=array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("Min is "+min+"\nMax is "+max);
	}
}
