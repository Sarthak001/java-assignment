public class Patient {
    private String name;
    private Double height;
    private Double weight;

    public Patient(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double BMI() {
        double bmi = 0.0;
        bmi = (this.weight / (this.height * this.height));
        return bmi;

    }

    public static void main(String[] args) {
        Patient calbmi = new Patient("sarthak", 185.0, 70.0);
        System.out.println(calbmi.BMI());
    }

}
