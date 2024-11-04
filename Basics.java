public class Basics {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int max;
        max = Math.max(a, b);
        System.out.println(max);

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        AQWERTYU cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
