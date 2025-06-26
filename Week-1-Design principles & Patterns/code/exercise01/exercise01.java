// Exercise 1: Implementing the Singleton Pattern

public class exercise01 {
    private static exercise01 instance;
    private exercise01() {
        // constructor
    }

    public static exercise01 getInstance() {
        if (instance == null) {
            instance = new exercise01();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World! This is Cognizant Digital Nurture 4.0");
    }

    public static void main(String[] args) {
        exercise01 singleton = exercise01.getInstance();
        singleton.showMessage();
        exercise01 singleton2 = exercise01.getInstance();
        singleton2.showMessage();
    }
    
}
