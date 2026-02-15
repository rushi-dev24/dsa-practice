package _01_array_traversal;

public class SecondLarge {
	public static void secondLargeElement(int[] array) {
		if(array==null || array.length<2) return;
		int firMax=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE,len=array.length;
		for(int i=0;i<len;i++) {
			if(firMax<array[i]) {
				secMax=firMax;
				firMax=array[i];
			}
			else if(array[i]>secMax && array[i]!=firMax) {
				secMax=array[i];
			}
		}
		if(secMax==Integer.MIN_VALUE){
			secMax=-1;
		}
		System.out.println("First Max "+firMax+"\nSecond max "+secMax);
	}
}
