public class PalindromeApp {
    static void main() {
        System.out.println("WELCOME TO PALINDROME CHECKER MANAGEMENT SYSTEM");
                System.out.println("VERSION 1.0");
        System.out.println("System initiilized sucessfully");
     String input ="MADAM";
        boolean ispalindrome =true;
        for(int i=0;i<input.length()/2;i++)
        {
            if(input.charAt(i) !=input.charAt(input.length()-1-i))
            {
                ispalindrome =false;
                break;

            }
        }
        if(ispalindrome) {
            System.out.println(input + "is palindrome.");
        }else{
            System.out.println(input +"not a palindrome");
        }
    }
}

