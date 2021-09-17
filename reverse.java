public class reverse
{
    public static void main (String args[]){
        int num = Integer.parseInt(args[0]);
        int rem = 0;
    while(num > 0)
    {
        rem = rem*10 + num%10;
        num = num/10;
        
    }
    System.out.println("The reversed number is " + rem);
    }
}
