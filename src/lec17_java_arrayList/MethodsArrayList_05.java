package lec17_java_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

// not important, Use of Scanner class
public class MethodsArrayList_05 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Please enter int type number");
		Scanner scanner = new Scanner(System.in);
		int limit = 5;
		for (int i = 0; i < limit; i++) {
			ar.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("Here is your result: " + ar);

	}

}