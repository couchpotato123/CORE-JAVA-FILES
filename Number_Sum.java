class Test
{
    public static void main(String args[])
    {
        // First method using division
        int n=0, sum=0, r=0;
        n=Integer.parseInt(args[0]);
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);

        // Second method using index of arguement
        String charnum = args[1];
        int num=0, sum1=0;
        char letter;
        for(int i=0; i<charnum.length(); i++)
        {
            letter=charnum.charAt(i);
            num=Character.getNumericValue(letter); // or we can use Integer.ParseInt(String.valueof(letter))
            sum1=sum1+num;
        }
        System.out.println(sum1);
    }
}