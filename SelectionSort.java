
public class SelectionSort {

	public static void main(String[] args) {
		
		
		int[] inputArr = {79, 34, 25, 37, 29};
		
		int arrSize = inputArr.length;
		int temp;
		for(int i=0; i < arrSize; i++) {
			
			for(int j=i+1;j<arrSize; j++) {
				if(inputArr[i] > inputArr[j]) {
					temp = inputArr[j];
					inputArr[j]=inputArr[i];
					inputArr[i] = temp;
					
				}
			}
		}
		
		for (int i=0; i <arrSize; i++) {
			System.out.println(inputArr[i]);
		}

	}
	

}
