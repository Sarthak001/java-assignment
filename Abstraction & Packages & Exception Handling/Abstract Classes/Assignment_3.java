import java.util.Random;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {

    void play() {

        System.out.println("Piano is playing tan tan tan tan");

    }
}

class Flute extends Instrument {

    void play() {
        System.out.println("Flute is playing toot toot toot toot");

    }
}

class Guitar extends Instrument {

    void play() {
        System.out.println("Guitar is playing tin tin tin tin");
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        Instrument obj_arr[] = new Instrument[10];

        Random r = new Random();
        int max, min;
        max = 3;
        min = 1;

        for (int i = 0; i <= 9; ++i) {
            int random;
            random = r.nextInt((max - min) + 1) + min;
            if (random == 1) {
                obj_arr[i] = new Piano();
                obj_arr[i].play();            
            } else if (random == 2) {
                obj_arr[i] = new Flute();
                obj_arr[i].play();
            } else if (random == 3) {
                obj_arr[i] = new Guitar();
                obj_arr[i].play();
            }
        }

        // for (int i = 0; i <= 9; ++i) {
        //     if (arr[i] == "Piano") {
        //         obj_arr[i] = new Piano();
        //         obj_arr[i].play();
        //     } else if (arr[i] == "Flute") {
        //         obj_arr[i] = new Flute();
        //         obj_arr[i].play();
        //     } else if (arr[i] == "guitar") {
        //         obj_arr[i] = new Guitar();
        //         obj_arr[i].play();
        //     }
        // }

        for (int i = 0; i <= 9; ++i) {
            if (obj_arr[i] instanceof Piano) {
                System.out.println("Piano Object is Stored at index: " + i + " memory address: " + obj_arr[i]);
            } else if (obj_arr[i] instanceof Flute) {
                System.out.println("Piano Object is Stored at index: " + i + " memory address: " + obj_arr[i]);

            } else if (obj_arr[i] instanceof Guitar) {
                System.out.println("Piano Object is Stored at index: " + i + " memory address: " + obj_arr[i]);

            }
        }

    }

}
