public class question4 {
    public static void main(String[] args) {
        int array1[] = {1,4,3,9,2,6,7,8};
        int max=0;

        for(int i=0; i<array1.length; i++)
        {
            if(max<array1[i])
                max=array1[i];
        }

        int array2[] = {5,6,7,8};
        boolean array[] = new boolean[max+1];

        for(int i=0; i<array1.length; i++)
        {
            array[array1[i]]=true;
        }

        int num=0;
        System.out.println("Common Elements are :");
        
        for(int i=0; i<array2.length; i++)
        {
            num=array2[i];
            if(num>max)
            {
                continue;
            }
            if(array[num]==true)
            {
                System.out.print(num+" ");
            }
        }
    }
}
