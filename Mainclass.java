public class Mainclass {
    public static void main(String[] args) {
     subClass sc = new subClass();
     subClass.disp();
    }
}
class subClass{
    static String msg = "Hello World! Welcome to classes";
    static void disp(){
        System.out.println(msg);
    }
}
