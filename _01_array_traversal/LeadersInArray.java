package _01_array_traversal;

public class LeadersInArray {
	public static void leadersInArray(int[] array) {
		if(array==null || array.length==0) return;
		int leader=array[array.length-1];
		System.out.println(leader);
		for(int i=array.length-2;i>=0;i--) {
			if(array[i]>leader) {
				leader=array[i];
				System.out.println(leader);
			}
		}
	}
}
