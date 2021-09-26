
public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
	
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	for(int i = 0; i < 7; i++){
		int num = number(i);
		
		System.out.print(num + " ");
		}
	}
	  
	public static int number(int num){
		if(num == 0)
			return 0;
		else if(num == 1 )
			return 1;
		else return number(num-1) + number(num-2);
		}

	public static int sumOfArray(Integer[] arr, int num){
		if(num == 0)
			return 0;
		return sumOfArray(arr,(num -1)) + arr[num -1];

		}
}