import java.util.Arrays; 
public class TripletsSum {
    static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	static int countTriplets(int n, int sum) 
	{ 
        System.out.println("Input : ");
        for(int loop=0; loop<n; loop++)
            System.out.print("| "+arr[loop]+" |");
        System.out.println();
		Arrays.sort(arr); 
		int ans = 0;
		for (int i = 0; i < n - 2; i++) 
		{ 
			int left = i + 1, right = n - 1; 
			while (left < right) 
			{ 
				if (arr[i] + arr[left] + arr[right] >= sum) 
					right--; 
				else
				{
					ans += (right - left); 
					left++; 
				} 
			} 
		} 
		return ans; 
	} 
	public static void main(String[] args) 
	{ 
		int sum = 12; 
		System.out.println("Possible of triples with smaller than a given sum : "+countTriplets(arr.length, sum)); 
	} 
}