import java.util.ArrayList;

public class DuplicatesInArray {

	static void findDuplicates(
	int arr[], int len)
	{

		
		boolean ifPresent = false;

		
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					
					if (al.contains(arr[i])) {
						break;
					}

					
					else {
						al.add(arr[i]);
						ifPresent = true;
					}
				}
			}
		}

		
		if (ifPresent == true) {

			System.out.print(al + " ");
		}
		else {
			System.out.print(
				"No duplicates present in arrays");
		}
	}

	
	public static void main(String[] args)
	{

		int arr[] = {35,15,25,11,80,35,11,22,43,15};
		int n = arr.length;

		findDuplicates(arr, n);
	}
}
