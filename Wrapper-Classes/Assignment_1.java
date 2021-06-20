public class Assignment_1 {

    public static void int_range() {
        System.out.println("Integer Range:\n" + "min: " + Integer.MIN_VALUE + "\n" + "max: " + Integer.MAX_VALUE + "\n");
    }
    public static void double_range() {
        System.out.println("Double Range:\n" + "min: " + Double.MIN_VALUE + "\n" + "max: " + Double.MAX_VALUE + "\n");
    }

    public static void long_range() {
        System.out.println("Long Range:\n" + "min: " +Long.MIN_VALUE + "\n" + "max: " + Long.MAX_VALUE  + "\n");
    }

    public static void short_range() {
        System.out.println("Short Range:\n" + "min: " + Short.MIN_VALUE + "\n" + "max: " + Short.MAX_VALUE  + "\n");
    }

    public static void byte_range() {
        System.out.println("Byte Range:\n" + "min: " + Byte.MIN_VALUE + "\n" + "max: " + Byte.MAX_VALUE + "\n");
    }

    public static void float_range() {
        System.out.println("Float Range:\n" + "min: " + Float.MIN_VALUE + "\n" + "max: " + Float.MAX_VALUE  + "\n");
    }


    public static void main(String[] args) {

        int_range();
        double_range();
        long_range();
        short_range();
        byte_range();
        float_range();

    }
}