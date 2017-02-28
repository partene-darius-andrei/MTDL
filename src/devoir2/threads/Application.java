package devoir2.threads;

/**
 * Created by Darius on 2/28/2017.
 */
public class Application {

    public static void main(String[] args) {
        new MyThread("544", 5);
        new MyThread("123", 6);
        new MyThread("21", 3);
        new MyThread("999", 9);
        new MyThread("000", 5);
    }
}
