package _01_array_traversal;

public class SumAvg {
	public static void sumAvg(int[] array) {
		if(array==null || array.length==0) return;
		int sum=0,len=array.length;
		double avg;
		for(int i=0;i<len;i++) {
			sum+=array[i];
		}
		avg=sum/(double)len;
		System.out.println("Sum is "+sum+"\nAvg is "+avg);
	}
}
