
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		int toSearch = 78;
		
		int found = binarySearch(a, toSearch, 0, a.length);
		
		if(found == -1) {
			System.out.println("The element was not found");
		} else {
			System.out.println("The element was found at index : "+found);
		}

	}
	
	static int binarySearch(int[] a, int toSearch, int beginIndex, int endIndex) {
		
		int index = -1;
		if (endIndex >= beginIndex) { 	
			int midIndex = (endIndex + beginIndex)/2;					
		
			for (int i = beginIndex; i < endIndex; i++) {
				if (a[midIndex] == toSearch) {
					index = midIndex;
				} else if (a[midIndex] > toSearch) {
					return binarySearch(a, toSearch, beginIndex, midIndex -1);
				} else {
					return binarySearch(a, toSearch, midIndex + 1, endIndex);
				}
			}
		
		}
		
		return index;
		
	}

}
