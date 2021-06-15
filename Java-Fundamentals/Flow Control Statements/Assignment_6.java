public class Assignment_6 {
    public static void main(String[] args) {
        String gender = args[0];
        String s_age = args[1];
        int age = Integer.parseInt(s_age);

        if (gender == "Female" || gender == "female" || gender == "FEMALE") {
            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of intrest is 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of intrest is 9.2%");

            }
        } else {

            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of intrest is 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of intrest is 10.5%");

            }

        }

    }
}
