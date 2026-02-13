package _01_array_traversal;

public class CheckSortOrNot {
	public static void chechSortOrNot(int[] array) {
		if(array==null || array.length==0) return;
		boolean isSorted=true;
		if(array.length==1) isSorted=true;
		else {
			int prev=array[0],curr;
			for(int i=1;i<array.length;i++) {
				curr=array[i];
				if(curr<prev) {
					isSorted=false;
					break;
				}
				prev=curr;
			}
			if(isSorted) {
				System.out.println("Array is sorted");
			}else {
				System.out.println("Array is not sorted");
			}
		}
	}
}
