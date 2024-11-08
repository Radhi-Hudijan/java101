public class Methods {
    static void mymethod() {
        System.out.println("Hello World");
    }

    public void myPublicMethod() {
        System.out.println("Hello from public method");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        mymethod();
        Methods pubOje = new Methods();
        pubOje.myPublicMethod();

        Methods myCar = new Methods();

        myCar.fullThrottle();
        myCar.speed(200);
    }

}
