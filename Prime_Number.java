import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of prime numbers : ");
        int n = input.nextInt();
        boolean array[] = new boolean[n];
        int a[] = new int[]{2,3,5,7,11};
        for(int j=0; j<4; j++)
        {
            for(int i=a[j]+a[j]; i<n; i=i+a[j])
            {
                array[i]=true;
            }
        }
        for(int i=2; i<n; i++)
        {
            if(array[i]==false)
            {
                System.out.println(i+ " ");
            }
        }

        input.close();
    }
}
