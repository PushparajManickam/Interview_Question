public class SubWithSum {
    int smallestSubWithSum(int[] arr,int size, int givenValue){
         int start, end, minLength = size+1;
        for(start=0; start<size; start++){
            int currSum = arr[start];
            if(currSum>givenValue) return 1;
            for(end=start+1; end<size; end++){
                currSum = currSum+arr[end];
                if(currSum>givenValue && (end-start+1)<minLength)
                    minLength = end-start+1;
            }
        }
    return minLength;
    }
    public static void main(String[] args) {
        SubWithSum swSum  = new SubWithSum();
        int[] a = {1, 4, 45, 6, 0, 19};
        System.out.println("Input : ");
        for(int i=0; i<a.length; i++)
            System.out.print("| "+a[i]+" |");
        int x = 51;
        System.out.println("\nSmallest subArray with sum greater than a given value");
        int result = swSum.smallestSubWithSum(a, a.length, x);
        if(result==a.length+1)
            System.out.println("No possible subArray");
        else
            System.out.println(result);
    }
}
