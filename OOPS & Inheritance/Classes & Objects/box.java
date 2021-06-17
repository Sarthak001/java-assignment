public class box {
    private double width;
    private double height;
    private double depth;

    box(Double width, Double height, Double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    public Double volume() {
        double res = 0.0;
        res = (this.width * this.height * this.depth);
        return res;
    }

    public static void main(String[] args) {
        double res;
        box calvol = new box(2.0, 2.0, 2.0);
        res = calvol.volume();
        System.out.println("Volume of box : " + res);

    }

}
