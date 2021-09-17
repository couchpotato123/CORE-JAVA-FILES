import java.util.Scanner;
public class String_problem {
    public static void main(String[] args) {
        String str1 = "Direct Assignment";
        char[] ch={'c','h','a','r'};
        Scanner input = new Scanner(System.in);
        String str2 = new String(ch);
        String str3 = new String("Through Object");
        System.out.print("Enter the string : ");
        String str4 = input.nextLine();
        System.out.println("Different types of storaging of strings : ");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        input.close();
    }
}
