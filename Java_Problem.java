public class Java_Problem {
    public static void main(String[] args) {
        char first_letter,second_letter;
        first_letter=args[0].charAt(0);
        first_letter=Character.toUpperCase(first_letter);
        second_letter=args[1].charAt(0);
        second_letter=Character.toLowerCase(second_letter);
        if(first_letter<second_letter)
            System.out.println(first_letter+""+second_letter);
        else
            System.out.println(second_letter+""+first_letter);
    }
}

