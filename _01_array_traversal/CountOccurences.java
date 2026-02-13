package _01_array_traversal;

public class CountOccurences {
	public static void countOccurances(int[] array) {
		if(array==null || array.length==0) return;
		int count;
		boolean isAppeared=false;
		for(int i=0;i<array.length;i++) {
			isAppeared=false;
			for(int k=0;k<i;k++) {
				if(array[k]==array[i]) {
					isAppeared=true;
				}
			}
			if(isAppeared) {
				continue;
			}
			count=0;
			for(int j=0;j<array.length;j++) {
				if(array[j]==array[i]) {
					count+=1;
				}
			}
			if(count==1) {
				System.out.println(array[i]+" -> "+count+" time");
			}else {
				System.out.println(array[i]+" -> "+count+" times");
			}
		}
	}
}
