public class Array_Arguements {
    public static void main(String[] args) {
        int len=args.length;
        String array[] = new String[len];
        System.out.println("No of Arguements are :" + " "+len);
        if(len!=0)
        {
            System.out.println("The following are the Arguements :");
            for(int i=0; i<len; i++)
            {
                array[i]=args[i];
            }
            for(int i=0; i<len; i++)
            {
                System.out.println(array[i]);
            }
        }
        else
        {
            System.out.println("There are no Arguements Given");
        }
    }
    
}