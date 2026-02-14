package _02_prefix_sum;

public class NumberOfEvens {
	public static void numberOfEvens(int[] arr,int l,int r) {
		if(arr==null || arr.length==0)return;
		int[] prefix=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
			prefix[i]=count;
		}
		if(l==0)System.out.println(prefix[r]);
		else System.out.println(prefix[r]-prefix[l-1]);
	}
}
