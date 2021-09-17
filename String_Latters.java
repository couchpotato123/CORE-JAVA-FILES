import java.util.Scanner;
public class String_Latters                                                   {
    public static void main(String args[])                                  {
      Scanner input = new Scanner(System.in);
      String inp = input.nextLine();    
      int count = 0;
      for (int i=0; i<inp.length(); i++)                                    {
          if (Character.isAlphabetic(inp.charAt(i)) == true)                {
              count = count+1;                                              }
                                                                            }
      if(count== inp.length())                                              {
          System.out.println("The given string has "+count+" letters in it");
                                                                            }
      input.close();}}