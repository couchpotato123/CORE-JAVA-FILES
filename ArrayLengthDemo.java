public class ArrayLengthDemo {
    public static void main(String[] args) {
        int source[] = {100, 200, 300};
        int destination[] = new int[3];

        System.arraycopy(source, 0, destination, 0, source.length);

        for(int i=0; i<destination.length; i++)
        {
            System.out.println(destination[i]);
        }
    }
}
