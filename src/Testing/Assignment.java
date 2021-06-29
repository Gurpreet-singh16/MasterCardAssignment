package Testing;

import java.util.*;

public class Assignment {

	static ArrayList<String> lst = new ArrayList<>();

	public String Swap(String a, int i, int j) {
		char[] arr = a.toCharArray();
		char temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

	public ArrayList<String> recursiveCall(String str, int start, int end) {

		if (start == end - 1)
			lst.add(str);

		else {
			for (int i = start; i < end; i++) {

				str = Swap(str, start, i);
				recursiveCall(str, start + 1, end);
				str = Swap(str, start, i);
			}
		}
		return lst;
	}

	public static void main(String[] args) {

		// I have assumed that there are no duplicate characters in the string.

		Scanner scan = new Scanner(System.in);

		String str;
		System.out.print("Enter the string : ");
		str = scan.next();
		int len = str.length();
		Assignment obj = new Assignment();
		obj.recursiveCall(str, 0, len);

		for (int i = 0; i <= lst.size() - 1; i++) {
			System.out.println(lst.get(i));
		}
	}

}