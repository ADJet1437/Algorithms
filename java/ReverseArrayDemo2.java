public class ReverseArrayDemo2 {
	/**
	 * A demo that using algorithm to reverse a int array
	 *
	 * Fuction reverse accepts int[] as paramter
	 */
	public static void main(String args[]){
		//slkdjsll
		int[] array = new int[] {2, 4, 6, 8, 10};
		System.out.println("Current array:");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + ",");
		}
		System.out.println("");
		// reverse array
		int[] reversedArray = reverse(array);
		System.out.println("Reversed array:");
		for(int i=0; i<reversedArray.length; i++){
			System.out.print(reversedArray[i] + ",");
		}
		System.out.println("");
	}

	public static int[] reverse(int[] array){
		int tail = array.length - 1;
		int head = 0;
		int lenToLoop = array.length / 2;
		for(int i=0; i < lenToLoop; i++){
			int tmp = array[head];
		        array[head] = array[tail];
			array[tail] = tmp;
			head++;
			tail--;
		}
		return array;
	}
}
