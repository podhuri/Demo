package SeleniumBasics;

public class ArrayTask {
	
	public static int secondLargest(int[] intArray ,int size) {
		 
		int temp;
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				temp=intArray[i];
				intArray[i]=intArray[j];
				intArray[j]=temp;
				
			}
		}
		return intArray[size-2];
	}

	public static void main(String[] args) {
		
		int intArray[] = { 57,-57,57,-57 };
		System.out.println("Second largest element is : " +secondLargest(intArray,4));
	}

}
