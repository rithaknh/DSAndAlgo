
public class BubbleSort {

	public static void main(String[] args) {
	
		int[] a = {3,3,4,4,1,0};
		
		int len = a.length;
		int temp;
		
		System.out.println("Length is : "+len);
		
		for(int i = 0; i <= len; i++) {
			for(int j = 0; j < (len - 1); j++) {
				if (a[j] > a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
					

	}

}
