public class ReverseArrayDemo1{
	/**
	 * A demo to reverse an int array and a String array
	 * 
	 * Function reverse accept 2 types of parameters: int[] or String[]
	 *
	 * The idea of reverse is make a new array to accept from the old one
	 * from tail to head
	 */
	public static void main(String args[]){
		int[] array1 = new int[] {3, 5, 7, 9, 11};
		String[] array2 = new String[] {"a", "b", "c", "d", "e"};
		// Reverse array
		int[] reversedArray1 = reverse(array1);
		System.out.println("Reversed array1:");
		for(int i=0; i<reversedArray1.length; i++){
			System.out.print(reversedArray1[i] + ",");
		}
		System.out.println("");
		String[] reversedArray2 = reverse(array2);
		System.out.println("Reversed array2:");
                for(int i=0; i<reversedArray2.length; i++){
                        System.out.print(reversedArray2[i] + ",");
                }
		System.out.println("");

	}

	public static int[] reverse(int[] array){
		// make a new array
		int[] newArray = new int[array.length];
		for(int i = array.length - 1; i >= 0; i--){
			newArray[array.length-i-1] = array[i];
		}
		return newArray;
	}
        public static String[] reverse(String[] array){
                // make a new array
                String[] newArray = new String[array.length];
                for(int i = array.length - 1; i >= 0; i--){
                        newArray[array.length-i-1] = array[i];
                }
                return newArray;
        }

}
