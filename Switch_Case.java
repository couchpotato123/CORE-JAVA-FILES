public class Switch_Case {
    public static void main(String[] args) {
        char letter;
        letter=args[0].charAt(0);
        letter=Character.toLowerCase(letter);
        switch(letter)
        {
            case 'r':System.out.print("r -> Red");
                    break;
            case 'o':System.out.print("o -> Orange");
                    break;
            case 'b':System.out.print("b -> Blue");
                    break;
            case 'y':System.out.print("y -> Yellow");
                    break;
            case 'v':System.out.print("v -> Violet");
                    break;
            case 'i':System.out.print("i -> Indigo");
                    break;
            case 'g':System.out.print("g -> Green");
                    break;
            default:System.out.println("Invalid Letter");
        }

    }
    
}
