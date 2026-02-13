package _01_array_traversal;

public class LinearSearch {
	public static void linearSearch(int[] array,int key) {
		if(array==null || array.length==0) return;
		int index=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println(key+" not found");
		}else {
			System.out.println(key+" is found at "+index);
		}
	}
}
