import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "FirstClass Compartment";
    }

}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";

    }

}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }

}

class Luggage extends Compartment {
    public String notice() {

        return "Luggage Compartment";
    }

}

public class Assignment_2 {
    public static void main(String[] args) {
        Compartment obj_arr[] = new Compartment[10];
        Random r = new Random();
        int max, min;
        max = 4;
        min = 1;
     
        for (int j = 0; j <= 9; ++j) {
            int random;
            random = r.nextInt((max - min) + 1) + min;
            if (random == 1) {

                obj_arr[j] = new FirstClass();
                System.out.println(obj_arr[j].notice());

            }
             else if (random == 2) {
                obj_arr[j] = new Ladies();
                System.out.println(obj_arr[j].notice());

            }
            else if (random == 3) {
                obj_arr[j] = new General();
                System.out.println(obj_arr[j].notice());

            } 
            else if (random == 4) {
                obj_arr[j] = new Luggage();
                System.out.println(obj_arr[j].notice());

            }
        }

    }
}
