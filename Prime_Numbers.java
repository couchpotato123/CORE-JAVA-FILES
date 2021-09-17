public class Prime_Numbers {
    public static void main(String[] args) {
        int i=0, j=0, flag=0;
        int n=Integer.parseInt(args[0]);
        System.out.print(2+" ");
        for(i=3; i<n; i=i+2)
        {
            for(j=2; j<=Math.sqrt(i); j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
            flag=0;
        }
    }
}
