//Reverse String without affect special character
public class ReverseString {
    void reverseString(char[] a){
        int left=0, right=a.length-1;
        while(left<right){
            if(!Character.isAlphabetic(a[left]))
                left++;
            else if(!Character.isAlphabetic(a[right]))
                right--;
            else{
                char temp   = a[left];
                a[left]     = a[right];
                a[right]    = temp;
                left++;
                right--;
            }
        }
       // System.out.println("Output : "+a.toString());
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String s    = "#Pushparaj,Is_Coder!"; //#Pushparaj,Is_Coder!
        char[] arr  = s.toCharArray();
        System.out.println("Input : "+s);
        rs.reverseString(arr);
        String revString = new String(arr);
        System.out.println("Output : "+revString);
    }
}

