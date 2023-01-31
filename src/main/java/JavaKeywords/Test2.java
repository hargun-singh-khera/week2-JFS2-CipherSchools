package JavaKeywords;
class App {
    App() {
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class Test2 extends App {
    Test2() {
        super(20); //used to call constructor of base class
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        new Test2();
    }
}
// if u call constructor of derived then the first constructor to be called will be constructor of base and then derived
