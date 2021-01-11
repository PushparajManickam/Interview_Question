// A Java program that returns true if there is a Pythagorean 
// Triplet in a given array. 
import java.util.*; 
class PythagoreanTriplet { 
	// Returns true if there is a triplet with following property 
	// A[i]*A[i] = A[j]*A[j] + A[k]*[k] 
	// Note that this function modifies given array 
	static boolean isTriplet(int arr[], int n) { 
		// Square array elements 
		for (int i = 0; i < n; i++) 
			arr[i] = arr[i] * arr[i]; 

		// Sort array elements 
		Arrays.sort(arr); 
		// Now fix one element one by one and find the other two 
		// elements 
		for (int i = n - 1; i >= 2; i--) { 
			// To find the other two elements, start two index 
			// variables from two corners of the array and move 
			// them toward each other 
			int left = 0; // index of the first element in arr[0..i-1] 
			int right = i - 1; // index of the last element in arr[0..i-1] 
			while (left < right) { 
				// A triplet found 
				if (arr[left] + arr[right] == arr[i]) 
					return true; 

				// Else either move 'l' or 'r' 
				if (arr[left] + arr[right] < arr[i]) 
					left++; 
				else
					right--; 
			} 
		} 

		// If we reach here, then no triplet found 
		return false; 
	} 

	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		int arr[] = { 3, 1, 4, 6, 5 }; 
		int arr_size = arr.length; 
		if (isTriplet(arr, arr_size) == true) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

