
import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        String revString=sb.reverse().toString();
        if(str.equalsIgnoreCase(revString)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }

    }
}