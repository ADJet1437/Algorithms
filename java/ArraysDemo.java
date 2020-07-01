public class ArraysDemo{
    /**
     * A class demo that merge 2 arrays and deduplicate
     * input 1: {"peter", "jet", "tom"}
     * input 2: {"Jack", "Liza", "jet"}
     * output: {"peter", "jet", "tom", "Jack", "Liza"}
     */
    public static void main(String args[]){
        String[] names1 = new String[] {"peter", "jet", "tom"};
	String[] names2 = new String[] {"Jack", "Liza", "jet"};
	String[] names3 = uniqueNames(names1, names2);
	//System.out.print(names3);
	for(int i = 0; i < names3.length; i++){
		System.out.println(names3[i]);
	}
    }

    public static String[] uniqueNames(String[] names1, String[] names2){
	String[] newArray = null;

        for(int i = 0; i < names1.length; i++){
	    for(int j = 0; j < names2.length; j++){
	        if(i == j){
			// Remove element
			String[] newArray1 = remove(names2, j);
			newArray = newArray1;
			//names2.remove(j);
			//System.out.print(names2[j]);
		}
	    }
	}
	int newLength = names1.length + newArray.length;
	String[] newNames = new String[newLength];
	for(int i = 0; i < names1.length; i++){
		newNames[i] = names1[i];
	}
	for(int j = names1.length; j < newLength; j++){
		newNames[j] = newArray[j - names1.length];
	}
	return newNames;
    }

    public static String[] remove(String[] array, int index){
	    String[] newArray = new String[array.length - 1];
	    for(int i = 0; i < array.length; i++){
		    if(i != index && i < index){
			    newArray[i] = array[i];
		    }
		    if(i != index && i > index){
			    newArray[i - 1] = array[i];
		    }
	    }
	    return newArray;
    }
}
