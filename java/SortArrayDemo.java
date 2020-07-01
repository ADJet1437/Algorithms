public class SortArrayDemo{
	/**
	 * A class demo that use buble sort algorithm to sort a integer array
	 * input: {4, 5, 1, 15, 43, 55, 12, 20}
	 * output: (1, 4, 5, 12, 15, 20, 43, 55)
	 */
	public static void main(String args[]){
		int[] array = new int[] {4, 5, 1, 15, 43, 55, 12, 20};
		// sort array
		int[] sortedArray = sort(array);
		for(int i = 0; i < array.length; i++){
			System.out.println(sortedArray[i]);
		}
	}

	public static int[] sort(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1; j++){
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		return array;
	}
}
