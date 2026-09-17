import java.util.Scanner;
public class main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int x=sc.nextInt();
    Solution solution = new Solution();
    boolean result = solution.isPalindrome(x);
    System.out.println("Is Palindrome:"+result);
    sc.close();
  }
}
