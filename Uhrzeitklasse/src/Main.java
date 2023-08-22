public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(3, 20, 45);
        Time t3 = new Time(1, 20, 45);
        Time subtract = t2.subtract(t3);
        System.out.println("Subtraction result: " + subtract.toString()); // Ausgabe -> 02:00:00
    }
}
