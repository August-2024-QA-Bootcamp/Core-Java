package lec21_coding_challenge;

// n = any difference number, here 2

public class I05_count_all_distinct_pairs_with_difference_equal_to_n {
	static int[] array = { 2, 5, 3, 4, 1, 8, 12, 16 };
	static int difference = 2;
	static int size = array.length;
	
	public static int findPairs(int[] array, int size, int difference) {
		int count = 0;
		for(int i = 0; i<size-1;i++) { // 2
			
			for(int j = i+1; j<size; j++) { // 5, 3, 4, 1, 8, 12, 16
				
				if(array[i]-array[j]==difference || array[j]-array[i]==difference) {
					System.out.println("Pairs with given difference 2 are :::> " + array[i] + ", " + array[j]);
					count++;
				}				
			}			
		}
		System.out.println("Incident happen: " + count);
		return count;
	}

	public static void main(String[] args) {
		findPairs(array, size, difference);

	}

}
