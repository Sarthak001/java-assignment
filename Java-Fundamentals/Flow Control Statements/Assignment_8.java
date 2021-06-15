public class Assignment_8 {
    public static void main(String[] args) {

        String code = args[0];

        switch (code) {
            case "R":
                System.out.println("Red");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");

        }

    }
}
