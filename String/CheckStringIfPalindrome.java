public class CheckStringIfPalindrome {

    public static void main(String[] args){
        String str = "aibohphobia";
        int mid = str.length()/2;
        for(int i =0; i<mid; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("This string is not a palindrome");
                System.exit(0);
            }

        }
        System.out.println("String is Palindrome");

    }
    
}
